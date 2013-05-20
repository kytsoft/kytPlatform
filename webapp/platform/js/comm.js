var _upind=undefined, _result, _isedit=false, _fieldeditcg=false, _typejson=[], _fkfieldeditcg=false;
var editfieldIndex = undefined;
var editfkIndex = undefined;
var relationjson=[{"id":"one","text":"one"},{"id":"one-nofk","text":"one-nofk"},{"id":"many","text":"many"}];
var relentity_json=[],relentityfield_json=[],field_json=[];
$.ajax({
	url:'/platform/control/getFieldTypes',
	//url: '<@ofbizUrl>getFieldTypes</@ofbizUrl>',
	type: "GET",
	async:false,
	dataType: "json",
	success: type_ready,
	error: error_func
});
$(document).ready(function(){
	$.ajax({
		url:'/platform/control/downloadEntityXml',
		//url: '<@ofbizUrl>downloadEntityXml</@ofbizUrl>',
		data:{"xmlName":"entitymodel"},
		type: "GET",
		dataType: "xml",
		cache:false,
		complete: xml_ready,
		error: error_func
	 });
});
function error_func(result) {
	alert(result.responseText);
}
function xml_ready(result){
	_result = result.responseXML;
	xml_load_entity();
}
function type_ready(result){
	_typejson = result;
}
function xml_load_entity(){
	relentity_json=[];
	$(_result).find('entity').each(function(index){
		var item = {id:$(this).attr('entity-name'),text:$(this).attr('entity-name')};
		relentity_json.push(item);
		$('#dg1').datagrid('appendRow',
			{"entityname":$(this).attr('entity-name'),"entitypackage":$(this).attr('package-name'),"entitytitle":$(this).attr('title'),"entityindex":index}
		);
	});
}
function newEntity() {
	_isedit=false;
	$('#dlg').dialog('open').dialog('setTitle', '新建实体');
	emptyForm();
}
function editEntity() {
	_isedit=true;
	emptyForm();
	var row = $('#dg1').datagrid('getSelected');
	if (row) {
		$('#dlg').dialog('open').dialog('setTitle', '编辑实体');
		loadForm(row);
	}
}
function saveEntity() {
	$('#dg1').datagrid('loadData',{total:0,rows:[]});
	var _name = $("#new-entity-name").val();
	var _title = $("#new-entity-title").val();
	var _package = $("#new-entity-package").val();
	if(_isedit){
		var _edit_index=$("#new-entity-hidden").val();
		$(_result).find('entity').each(function(index){
				if(index==_edit_index){
					$(this).attr('entity-name',_name);
					$(this).attr('package-name',_package);
					$(this).attr('title',_title);
				}
			}
		);
		uploadEntityXml();
	}else{
		var _savexml = '';
		_savexml = '<entity entity-name="'+ _name +'" package-name="'+ _package +'" title="'+ _title +'"></entity>';
		$(_result).find('version').afterXml(_savexml);
	}
	$('#dlg').dialog('close');
	xml_load_entity();
}
function destroyEntity() {
	var row = $('#dg1').datagrid('getSelected');
	if (row) {
		$.messager.confirm('提示','确定删除这个实体?', function(r) {
					if (r) {
						$(_result).find('entity[entity-name="' + row.entityname + '"]').remove();
						$('#dg1').datagrid('loadData',{total:0,rows:[]});
						$('#dg').datagrid('loadData',{total:0,rows:[]});
						$('#fks').datagrid('loadData',{total:0,rows:[]});
						uploadEntityXml();
						xml_load_entity();
					}
				});
	}
}
function emptyForm(){
	$("#new-entity-name").val('').focus();
	$("#new-entity-title").val('');
	$("#new-entity-package").val('');
	$("#new-entity-hidden").val('');
}
function loadForm(row){
	$("#new-entity-name").val(row.entityname).focus();
	$("#new-entity-title").val(row.entitytitle);
	$("#new-entity-package").val(row.entitypackage);
	$("#new-entity-hidden").val(row.entityindex);
}
function onClickEntity(index,row){
	var exit1=true,exit2=true;
	if(_fieldeditcg==true){
		$.messager.confirm('提示','确定离开字段编辑?', function(r) {
			if (r) {
				exit1 = true;
			}else{
				exit1 = false;
			}
		});
	}else if(_fkfieldeditcg==true){
		$.messager.confirm('提示','确定离开外键编辑?', function(r) {
			if (r) {
				exit2=true;
			}else{
				exit2 = false;
			}
		});
	}
	if(exit1==true&&exit2==true){
		_fieldeditcg=false;
		_fkfieldeditcg=false;
		__onSelEntity(index,row);
	}else if(exit1==true&&exit2==true){
		_fieldeditcg=false;
//		__onSelEntity(index,row);
		$('#dg1').datagrid('selectRow',_upind);
	}else if(exit1==true&&exit2==false){
		_fieldeditcg=false;
//		__onSelEntity(index,row);
		$('#dg1').datagrid('selectRow',_upind);
	}else{
		$('#dg1').datagrid('selectRow',_upind);
	}
}
function __onSelEntity(index,row){
	_upind = row.entityindex;
	//重新加载字段
	$('#dg').datagrid('loadData',{total:0,rows:[]});
	var _selectentity = $(_result).find('entity').eq(row.entityindex);
	var _primarr = new Array();
	$(_selectentity).find('prim-key').each(function(index){
		var field=$(this).attr('field');
		_primarr.push(field);
	});
	$(_selectentity).find('field').each(function(index){
		if($.inArray($(this).attr('name'), _primarr)==-1){
			$('#dg').datagrid('appendRow',
<<<<<<< HEAD
				{"fieldname":$(this).attr('name'),"fielddis":$(this).find("description").val(),"fieldtype":$(this).attr('type'),"fieldnotnull":$(this).attr('not-null'),"primkey":'false',"fieldindex":index,"fieldoldname":$(this).attr('name')}
			);
		}else{
			$('#dg').datagrid('appendRow',
				{"fieldname":$(this).attr('name'),"fielddis":$(this).find("description").val(),"fieldtype":$(this).attr('type'),"fieldnotnull":$(this).attr('not-null'),"primkey":'true',"fieldindex":index,"fieldoldname":$(this).attr('name')}
=======
				{"fieldname":$(this).attr('name'),"fielddis":$(this).find("description").text(),"fieldtype":$(this).attr('type'),"fieldnotnull":$(this).attr('not-null'),"primkey":'false',"fieldindex":index,"fieldoldname":$(this).attr('name')}
			);
		}else{
			$('#dg').datagrid('appendRow',
				{"fieldname":$(this).attr('name'),"fielddis":$(this).find("description").text(),"fieldtype":$(this).attr('type'),"fieldnotnull":$(this).attr('not-null'),"primkey":'true',"fieldindex":index,"fieldoldname":$(this).attr('name')}
>>>>>>> a82a287a421cc6791992fb05b702489747284e72
			);
		}
	});
	//重新加载外键关系
	$('#fks').datagrid('loadData',{total:0,rows:[]});
	$(_selectentity).find('relation').each(function(index){
		var _rel_name="";
		if($(this).find("key-map").attr("rel-field-name")!=null&&$(this).find("key-map").attr("rel-field-name")!=undefined){
			_rel_name = $(this).find("key-map").attr("rel-field-name");
		}else{
			_rel_name = $(this).find("key-map").attr("field-name");
		}
		$('#fks').datagrid('appendRow',
				{"fkname":$(this).attr('fk-name'),"entityfield":$(this).find("key-map").attr("field-name"),"relentity":$(this).attr("rel-entity-name"),"relentityfield":_rel_name,"relation":$(this).attr("type"),"relationtitle":$(this).attr("title"),"relationindex":index,"relationoldname":$(this).attr('fk-name')}
		);
	});
}
function newField(){
	if(_selectEntityName()==false) return;
	if(endEditing()){
		$('#dg').datagrid('appendRow',{"fieldname":"","fielddis":"","fieldtype":"","fieldnotnull":false,"primkey":false});
		editfieldIndex = $('#dg').datagrid('getRows').length-1;
		$('#dg').datagrid('selectRow', editfieldIndex).datagrid('beginEdit', editfieldIndex);
		_fieldeditcg=true;
	}
}
function acceptField(){
	if(_selectEntityName()==false) return;
	var _changerows = $('#dg').datagrid('getChanges');
	var _change = _changerows.length;
	if( _change > 0){
		endEditing();
		var _senty = $(_result).find('entity').eq(_upind);
		for(var i=0;i<_change;i++){
			if(_changerows[i].fieldname==''){
				continue; //字段名为空,忽略添加(或修改)
			}
			if(_changerows[i].fieldindex!=undefined){
				var _thisupd = _senty.find('field[name='+ _changerows[i].fieldoldname +']');
				if(_changerows[i].primkey=='true'){
					if(_changerows[i].fieldoldname!=_changerows[i].fieldname){
						_senty.find('prim-key[field='+ _changerows[i].fieldoldname +']').remove();
						var _savexml = '';
						_savexml = '<prim-key field="'+ _changerows[i].fieldname +'"/>';
						_senty.find('field').eq(-1).afterXml(_savexml);
					}else{
						var pk = _senty.find('prim-key[field='+ _changerows[i].fieldoldname +']');
						if(pk.length<1){
							var _savexml = '';
							_savexml = '<prim-key field="'+ _changerows[i].fieldname +'"/>';
							_senty.find('field').eq(-1).afterXml(_savexml);
						}
					}
				}else{
					_senty.find('prim-key[field='+ _changerows[i].fieldoldname +']').remove();
				}
				_thisupd.find('description').val(_changerows[i].fielddis);
				_thisupd.attr('type',_changerows[i].fieldtype);
				_thisupd.attr('not-null',_changerows[i].fieldnotnull);
				_thisupd.attr('name',_changerows[i].fieldname);
			}else{
				var _savexml = '<field name="'+ _changerows[i].fieldname +'" type="'+ _changerows[i].fieldtype +'" not-null="'+ _changerows[i].fieldnotnull +'"><description>'+ _changerows[i].fielddis +'</description></field>';
				_senty.prependXml(_savexml);
				if(_changerows[i].primkey=='true'){
					_savexml = '<prim-key field="'+ _changerows[i].fieldname +'"/>';
					_senty.find('field').eq(-1).afterXml(_savexml);
				}
			}
		}
	}else{
		$.messager.alert('提示','没有字段修改!');
	}
	_save_field();
	__reload_field();
}
function removeField(){
	if(_selectEntityName()==false) return;
	var row = $('#dg').datagrid('getSelected');
	if (row) {
		$.messager.confirm('提示','确定删除这个字段?', function(r) {
					if (r) {
						//该字段是否绑定有该实体外键,删除时是否忽略(1/2)
						if (editfieldIndex == undefined) {
							return;
						}
						$('#dg').datagrid('cancelEdit', editfieldIndex).datagrid('deleteRow', editfieldIndex);
						editfieldIndex = undefined;
						var _senty = $(_result).find('entity').eq(_upind);
						$(_senty).find('field[name='+ row.fieldoldname +']').remove();
						$(_senty).find('prim-key[field='+ row.fieldoldname +']').remove();
						$('#dg').datagrid('loadData',{total:0,rows:[]});
						_save_field();
						__reload_field();
					}
				});
	}
}
/*function rejectField(){
	if(_selectEntityName()==false) return;
	$('#dg').datagrid('rejectChanges');
}*/
function newRelation(){
	if(_selectEntityName()==false) return;
	var _senty = $(_result).find('entity').eq(_upind);
	var _fields = $(_senty).find('field');
	//判断实体字段是否为空
	if(_fields.length<1){
		$.messager.alert('提示','该实体没有添加字段,请先添加字段!');
		return;
	}
	$('#fks').datagrid('appendRow',{"fkname":"FK_","entityfield":"","relentity":"","relentityfield":"","relation":"","relationtitle":""});
}
function removeRelation(){
	if(_selectEntityName()==false) return;
	var row = $('#fks').datagrid('getSelected');
	if (row) {
		$.messager.confirm('提示','确定删除这个外键关系?', function(r) {
					if (r) {
						//删除外键代码
						endFkEditing();
						var _senty = $(_result).find('entity').eq(_upind);
						
						$(_senty).find('relation[fk-name='+ row.relationoldname +']').remove();
						_save_fkfield();
						__reload_fkfield();
					}
				});
	}
}
/*
 * =======================relation Xml=============================
 * <relation type="one" fk-name="FK_NAME" title="description" rel-entity-name="Entity">
 * 	<key-map field-name="fieldname" rel-field-name="fieldname"/>
 * </relation>
 *=================================================================
 */
function acceptRelation(){
	if(_selectEntityName()==false) return;
	var _changerows = $('#fks').datagrid('getChanges');
	var _change = _changerows.length;
	if( _change > 0){
		endFkEditing();
		var _senty = $(_result).find('entity').eq(_upind);
		//保存代码(1修改/2增加)
		for(var i=0;i<_change;i++){
			if(_changerows[i].fkname==''||_changerows[i].relation==''){
				continue;
			}
			if(_changerows[i].relationindex!=undefined){
				var _fkname = _changerows[i].fkname;
				var _fkname_old = _changerows[i].relationoldname;
				var _fktype = _changerows[i].relation;
				var _fktitle = _changerows[i].relationtitle;
				var _fkentity_rel = _changerows[i].relentity;
				var _fkfield = _changerows[i].entityfield;
				var _fkfield_rel = _changerows[i].relentityfield;
				var _fkdom = _senty.find('relation[fk-name='+ _fkname_old +']');
				$(_fkdom).attr('type',_fktype);
				$(_fkdom).attr('title',_fktitle);
				$(_fkdom).attr('rel-entity-name',_fkentity_rel);
				$(_fkdom).find('key-map').attr('field-name',_fkfield);
				if(_fkfield_rel!=''&&_fkfield_rel!=undefined){
					$(_fkdom).find('key-map').attr('rel-field-name',_fkfield_rel);
				}
				if(_fkname!=_fkname_old){
					$(_fkdom).attr('fk-name',_fkname);
				}
			}else{
				var _savexml = '<relation type="'+ _changerows[i].relation +'" fk-name="'+ _changerows[i].fkname +'" title="'+ _changerows[i].relationtitle +'"'+
				' rel-entity-name="'+ _changerows[i].relentity +'"></relation>';
				_senty.appendXml(_savexml);
				
				_savexml = '<key-map field-name="'+ _changerows[i].entityfield +'"';
				if(_changerows[i].relentityfield!=undefined&&_changerows[i].relentityfield!=''){
					_savexml = _savexml +' rel-field-name="'+ _changerows[i].relentityfield+'" ';
				}
				_savexml = _savexml +'/>';
				_senty.find('relation[fk-name='+ _changerows[i].fkname +']').appendXml(_savexml);
			}
		}
	}else{
		
	}
	_save_fkfield();
	__reload_fkfield();
}
function endEditing() {
	if (editfieldIndex == undefined) {
		return true;
	}
	if ($('#dg').datagrid('validateRow', editfieldIndex)) {
		var ed = $('#dg').datagrid('getEditor', {
			index : editfieldIndex,
			field : 'fieldname'
		});
		$('#dg').datagrid('endEdit', editfieldIndex);
		editfieldIndex = undefined;
		return true;
	} else {
		_fieldeditcg=true;
		return false;
	}
}
function endFkEditing() {
	if (editfkIndex == undefined) {
		return true;
	}
	if ($('#fks').datagrid('validateRow', editfkIndex)) {
		var ed1 = $('#fks').datagrid('getEditor', {
			index : editfkIndex,
			field : 'fkname'
		});
		//$('#fks').datagrid('removeEditor','relentity');
		$('#fks').datagrid('endEdit', editfkIndex);
		editfkIndex = undefined;
		return true;
	} else {
		_fkfieldeditcg=true;
		return false;
	}
}
function onClickRow(index) {
	if (editfieldIndex != index) {
		if (endEditing()) {
			_fieldeditcg=true;
			$('#dg').datagrid('selectRow', index).datagrid('beginEdit', index);
			editfieldIndex = index;
		} else {
			$('#dg').datagrid('selectRow', editfieldIndex);
		}
	}
}
function onClickCell(index) {
	if (editfkIndex != index) {
		if (endFkEditing()) {
			_fkfieldeditcg=true;
			
			field_json=[];
			var _selectentity = $(_result).find('entity').eq(_upind);
			$(_selectentity).find('field').each(function(index){
				var item = {id:$(this).attr('name'),text:$(this).attr('name')};
				field_json.push(item);
			});
			$('#fks').datagrid('addEditor',[{field:'relentity',editor:{type:'combobox',options:{valueField:'id',textField:'text',data:relentity_json,required:true}}},
			                                {field:'entityfield',editor:{type:'combobox',options:{valueField:'id',textField:'text',data:field_json,required:true}}}]);
			$('#fks').datagrid('selectRow', index).datagrid('beginEdit', index);
			editfkIndex = index;
		} else {
			$('#fks').datagrid('selectRow', editfkIndex);
		}
	}
}
function __reload_field(){
	_fieldeditcg=false;
	onClickEntity(_upind,$('#dg1').datagrid('getSelected'));
}
function _save_field(){
	_fieldeditcg=false;
	$('#dg').datagrid('acceptChanges');
	uploadEntityXml();
}
function __reload_fkfield(){
	_fkfieldeditcg=false;
	onClickEntity(_upind,$('#dg1').datagrid('getSelected'));
}
function _save_fkfield(){
	_fkfieldeditcg=false;
	$('#fks').datagrid('acceptChanges');
	uploadEntityXml();
}
function _selectEntityName(){
	if(_upind==undefined){
		$.messager.alert('提示','没有选择实体!');
		return false;
	}
	return true;
}
function uploadEntityXml(){
	$.ajax({
			url:'/platform/control/uploadEntityXml',
			//url: '<@ofbizUrl>uploadEntityXml</@ofbizUrl>',
			type: "POST",
			async:false,
			data:{"xmlName":"entitymodel","xmlContent":$(_result).xml()},
			dataType: "json",
			success: function(data){
				if(data=="success"){
				}else{
					alert("实体保存失败!");
				}
			},
			error: function(){
				alert("实体保存失败!");
			}
	});
}
$(function () {
    $.extend($.fn.datagrid.defaults.editors, {
    	combobox: {
            init: function (container, options) {
                var editor = $('<input />').appendTo(container);
                options.editable = false;
                editor.combobox(options);
                return editor;
            },
            getValue: function (target) {
                return $(target).combobox('getValue');
            },
            setValue: function (target, value) {
                $(target).combobox('setValue', value);
            },
            resize: function (target, width) {
                $(target).combobox('resize', width);
            },
            destroy: function (target) {
                $(target).combobox('destroy');
            }
        }
    });
    $.extend($.fn.datagrid.methods, {
    	editCell: function(jq,param){
            return jq.each(function(){
                var opts = $(this).datagrid('options');
                var fields = $(this).datagrid('getColumnFields',true).concat($(this).datagrid('getColumnFields'));
                for(var i=0; i<fields.length; i++){
                    var col = $(this).datagrid('getColumnOption', fields[i]);
                    colcol.editor1 = col.editor;
                    if (fields[i] != param.field){
                        col.editor = null;
                    }
                }
                $(this).datagrid('beginEdit', param.index);
                for(var i=0; i<fields.length; i++){
                    var col = $(this).datagrid('getColumnOption', fields[i]);
                    colcol.editor = col.editor1;
                }
            });
        },
	    addEditor: function(jq, param) {
	    	if (param instanceof Array) {
	    		$.each(param, function(index, item) {
	    			var e = $(jq).datagrid('getColumnOption', item.field);
	    			e.editor = item.editor;
	    		});
	    	} else {
	    		var e = $(jq).datagrid('getColumnOption', param.field);
	    		e.editor = param.editor;
	    	}
	    },
	    removeEditor: function(jq, param) {
	    	if (param instanceof Array) {
	    		$.each(param, function(index, item) {
	    			var e = $(jq).datagrid('getColumnOption', item);
	    			e.editor = {};
	    		});
	    	} else {
	    		var e = $(jq).datagrid('getColumnOption', param);
	    		e.editor = {};
	    	}
	    }
    });
});

<div style="padding-left:300px">
	<div id="entityCtrl">
		<table id="dg1" title="${uiLabelMap.managerentity!}" class="easyui-datagrid" style="width:700px;height:250px" url="" toolbar="#toolbar"
			rownumbers="true" fitColumns="true" singleSelect="true">
			<thead>
				<tr>
					<th field="entityname" width="50" align="center">${uiLabelMap.entityzh!}</th>
                    <th field="entitytitle" width="75" align="center">${uiLabelMap.describe!}</th>
                    <th field="entitypackage" width="75" align="center">${uiLabelMap.packagezh!}</th>
				</tr>
			</thead>
		</table>
		<div id="toolbar">  
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newEntity()">${uiLabelMap.createNew!}</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editEntity()">${uiLabelMap.editors!}</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyEntity()">${uiLabelMap.deletes!}</a>
		</div>
		<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px" closed="true" buttons="#dlg-buttons">  
			<div class="ftitle">${uiLabelMap.managerentity!}</div>
			<form id="fm" method="post" novalidate>
				<div class="fitem">
					<label>${uiLabelMap.entityzh!}:</label>
					<input name="entityName" class="easyui-validatebox" required="true">
				</div>
				<div class="fitem">
					<label>${uiLabelMap.describe!}:</label>
					<input name="entityDes">
				</div>
				<div class="fitem">
					<label>${uiLabelMap.packagezh!}:</label>
					<input name="entitypackage">
				</div>
			</form>
		</div>
		<div id="dlg-buttons">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveEntity()">${uiLabelMap.save!}</a>
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">${uiLabelMap.quxiao!}</a> 
		</div>
	</div>
	<div id="attribute">
		<table id="dg" class="easyui-datagrid" title="${uiLabelMap.managerAttribute!}" style="width:700px;height:auto"
			data-options="iconCls:'icon-edit',singleSelect:true,toolbar:'#tb',url:'',onClickRow: onClickRow">
			<thead>
				<tr>
	                <th data-options="field:'fieldname',width:100,align:'center',editor:'text'">${uiLabelMap.fieldName!}</th>
	                <th data-options="field:'fieldtype',width:140,align:'center',formatter:function(value,row){},
	                				  editor:{type:'combobox',options:{valueField:'productid',textField:'productname',url:'',required:true}}">类型</th>
					<th data-options="field:'pkey',width:100,align:'center',editor:{type:'checkbox',options:{on:true,off:false}}">${uiLabelMap.primary!}</th>
				</tr>
			</thead>
		</table>
	    <div id="tb" style="height:auto">
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="newField()">${uiLabelMap.createNew!}</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeField()">${uiLabelMap.deletes!}</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="acceptField()">${uiLabelMap.save!}</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="rejectField()">${uiLabelMap.back!}</a>
	    </div>
	</div>
	<div id="pkattribute">
		<table id="fks" class="easyui-datagrid" title="${uiLabelMap.managerguanxi!}" style="width:700px;height:auto"  
			data-options="iconCls:'icon-edit',singleSelect:true,toolbar:'#tb1',url:'',onClickRow: onClickRows">
			<thead>
				<tr>
	                <th data-options="field:'pguanxiID',width:100,align:'center'">${uiLabelMap.primaryKey!}</th>
	                <th data-options="field:'entitygl',width:140,align:'center',formatter:function(value,row){},editor:{type:'combobox',options:{valueField:'entitygl',textField:'pguanxiName',url:'',required:true}}">${uiLabelMap.Associative!}</th>
					<th data-options="field:'fk',width:140,align:'center',formatter:function(value,row){},editor:{type:'combobox',options:{valueField:'fk',textField:'productname',url:'',required:true}}">${uiLabelMap.fk!}</th>
					<th data-options="field:'isnull',width:100,align:'center',editor:{type:'text',options:{on:'P',off:''}}">${uiLabelMap.relation!}</th>
					<th data-options="field:'pkey',width:100,align:'center',editor:{type:'text',options:{on:'P',off:''}}">${uiLabelMap.fkName!}</th>
				</tr>
			</thead>
		</table>
		<div id="tb1" style="height:auto">
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append1()">${uiLabelMap.createNew!}</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="remove1()">${uiLabelMap.deletes!}</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept1()">${uiLabelMap.save!}</a>
	        <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject1()">${uiLabelMap.back!}</a>
		</div>
	</div>
</div>

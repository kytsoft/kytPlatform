  var url;  
            function newUser(){  
                $('#dlg').dialog('open').dialog('setTitle','新建实体');  
                $('#fm').form('clear');  
                url = 'save_user.php';  
              // $('#dg1').datagrid('appendRow',{"firstname":'',"lastname":'',"phone":"","email":""});
            }  
            function editUser(){  
                var row = $('#dg').datagrid('getSelected');  
                if (row){  
                    $('#dlg').dialog('open').dialog('setTitle','Edit User');  
                    $('#fm').form('load',row);  
                    url = 'update_user.php?id='+row.id;  
                }  
            }  
            function saveUser(){  
                $('#fm').form('submit',{  
                    url: url,  
                    onSubmit: function(){  
                        return $(this).form('validate');  
                    },  
                    success: function(result){  
                        var result = eval('('+result+')');  
                        if (result.errorMsg){  
                            $.messager.show({  
                                title: 'Error',  
                                msg: result.errorMsg  
                            });  
                        } else {  
                            $('#dlg').dialog('close');      // close the dialog  
                            $('#dg').datagrid('reload');    // reload the user data  
                        }  
                    }  
                });  
            }  
            function destroyUser(){  
                var row = $('#dg').datagrid('getSelected');  
                if (row){  
                    $.messager.confirm('Confirm','Are you sure you want to destroy this user?',function(r){  
                        if (r){  
                            $.post('destroy_user.php',{id:row.id},function(result){  
                                if (result.success){  
                                    $('#dg').datagrid('reload');    // reload the user data  
                                } else {  
                                    $.messager.show({   // show error message  
                                        title: 'Error',  
                                        msg: result.errorMsg  
                                    });  
                                }  
                            },'json');  
                        }  
                    });  
                }  
            }  
            
            
             var editIndex = undefined;  
        function endEditing(){  
            if (editIndex == undefined){return true}  
            if ($('#dg').datagrid('validateRow', editIndex)){  
                var ed = $('#dg').datagrid('getEditor', {index:editIndex,field:'productid'});  
                var productname = $(ed.target).combobox('getText');  
                $('#dg').datagrid('getRows')[editIndex]['productname'] = productname;  
                $('#dg').datagrid('endEdit', editIndex);  
                editIndex = undefined;  
                return true;  
            } else {  
                return false;  
            }  
        }  
        function endEditings(){  
        	if (editIndex == undefined){return true}  
        	if ($('#fks').datagrid('validateRow', editIndex)){  
        		var ed1 = $('#fks').datagrid('getEditor', {index:editIndex,field:'entitygl'});  
        		var productname = $(ed1.target).combobox('getText');  
        		$('#fks').datagrid('getRows')[editIndex]['productname'] = productname;  
        		$('#fks').datagrid('endEdit', editIndex);  
        		editIndex = undefined;  
        		return true;  
        	} else {  
        		return false;  
        	}  
        }  
        function onClickRow(index){  
            if (editIndex != index){  
                if (endEditing()){  
                    $('#dg').datagrid('selectRow', index)  
                            .datagrid('beginEdit', index);  
                    editIndex = index;  
                } else {  
                    $('#dg').datagrid('selectRow', editIndex);  
                }  
            }  
        }  
        function onClickRows(index){  
        	if (editIndex != index){  
        		if (endEditings()){  
        			$('#fks').datagrid('selectRow', index)  
        			.datagrid('beginEdit', index);  
        			editIndex = index;  
        		} else {  
        			$('#fks').datagrid('selectRow', editIndex);  
        		}  
        	}  
        }  
        function append(){  
            if (endEditing()){  
                $('#dg').datagrid('appendRow',{status:'P'});  
                editIndex = $('#dg').datagrid('getRows').length-1;  
                $('#dg').datagrid('selectRow', editIndex)  
                        .datagrid('beginEdit', editIndex);  
            }  
        }  
        function append1(){  
        	if (endEditings()){  
        		
        		$('#fks').datagrid('appendRow',{status:'P'});  
        		editIndex = $('#fks').datagrid('getRows').length-1;  
        		$('#fks').datagrid('selectRow', editIndex)  
        		.datagrid('beginEdit', editIndex);  
        	}  
        }  
        function remove(){  
            if (editIndex == undefined){return}  
            $('#dg').datagrid('cancelEdit', editIndex)  
                    .datagrid('deleteRow', editIndex);  
            editIndex = undefined;  
        }  
        function remove1(){  
        	if (editIndex == undefined){return}  
        	$('#fks').datagrid('cancelEdit', editIndex)  
        	.datagrid('deleteRow', editIndex);  
        	editIndex = undefined;  
        }  
        function accept(){  
            if (endEditing()){  
                $('#dg').datagrid('acceptChanges');  
            }  
        }  
        function accept1(){  
        	if (endEditings()){  
        		$('#fks').datagrid('acceptChanges');  
        	}  
        }  
        function reject(){  
            $('#dg').datagrid('rejectChanges');  
            editIndex = undefined;  
        }  
        function reject1(){  
        	$('#fks').datagrid('rejectChanges');  
        	editIndex = undefined;  
        }  
        function getChanges(){  
            var rows = $('#dg').datagrid('getChanges');  
            alert(rows.length+' rows are changed!');  
        }  
        function getChanges1(){  
        	var rows = $('#fks').datagrid('getChanges');  
        	alert(rows.length+' rows are changed!');  
        }  
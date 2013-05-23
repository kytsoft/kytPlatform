
		<script>
					function sublit(){
					alert("ssssssss");
						$("aaa").submit();
					}
		</script>
			<div  class="main-list"> 
					<h1>${uiLabelMap.formAttrEdit}</h1>
					<div class="plate_left">
							 <h2>${uiLabelMap.BT}</h2>
							 <form action = "<@ofbizUrl>formsubmit</@ofbizUrl>" method="post" id="aaa">
							 <table>
							 	<tr>
							 		<td>${uiLabelMap.formName}${formAtt.formName!}<input type="hidden" name="formName"  value="${formAtt.formName!}"/> </td>
							 		<td>
							 				${uiLabelMap.formType}<select name="type" value="${formAtt.formType!}">
							 				  		<option value="list">list</option>
							 				  		<option value="single">single</option>
							 				  		<option value="multi">multi</option>
							 				  		<option value="multi">upload</option>
							 				 </select>
							 		 </td>
							 	</tr>
							 	<tr>
							 		<td>target:<input type="text" value="${formAtt.formtarget!}" name="target"></td>
							 		<td></td>
							 	</tr>
							 	<tr>
							 		<td colspan="2"><input type="submit" value="${uiLabelMap.xiugai}"></td>
							 	</tr> 
							 </table>
							 </form>
							 
					</div>
					<div class="plate_right">
					</div>
			</div>
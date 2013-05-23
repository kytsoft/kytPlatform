
		</script>
			<div  class="main-list"> 
					<h1>${uiLabelMap.formAttrcreate}</h1>
					<div class="plate_left">
							 <h2>${uiLabelMap.BT}</h2>
							 <form action = "<@ofbizUrl>createFormsubmit</@ofbizUrl>" method="post" id="aaa">
							 <table>
							 	<tr>
							 		<td>${uiLabelMap.formName}<input type="text" name="formName"  value=""/>
							 				<input type="hidden" name="fileName"  value=""/>
							 		 </td>
							 		<td>
							 				${uiLabelMap.formType}<select name="type" value="">
							 				  		<option value="list">list</option>
							 				  		<option value="single">single</option>
							 				  		<option value="multi">multi</option>
							 				  		<option value="multi">upload</option>
							 				 </select>
							 		 </td>
							 	</tr>
							 	<tr>
							 		<td>${uiLabelMap.target}<input type="text" value="" name="target"></td>
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
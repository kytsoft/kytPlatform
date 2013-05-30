function openEdit(screenid,screengroupid){
	alert(screenid + " : " + screengroupid);
	window.open('listScreenForms?screenid='+screenid,"EditScreen",'top=10,height=300,channelmode=yes,toolbar=no,titlebar=no,status=no,menubar=no,location=no,directories=no,alwaysRaised=yes,z-look=yes',false);
}

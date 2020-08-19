/**
 * 
 */


function check(){
	if(document.frm.id.value==""){
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false; 
	}else if(document.frm.pw.value==""){
		alert("비밀번호를 입력해주세요.");
		document.frm.pw.focus();
		return false;
	}else if(document.frm.age.value==""){
		alert("나이를 입력해주세요.");
		document.frm.pw.focus();
		return false;
	}else if(isNaN(document.frm.age.value)){
		alert("숫자로 입력해주세요.");
		document.frm.pw.focus();
		return false;
	}else if($("input:radio[name='gender']").is(":checked") == null){
		return genderCheck();
//	}else if(document.frm.chk_mail.value==""){
//		alert("메일 수신여부를 체크하세요.")
//		return false;
//	}else if(document.frm.content.value==""){
//		alert("가입인사를 입력하세요.")
//		return false;
	
	}else{
		return true;
	}
	
	
	
	
	
	function genderCheck(){
		var checkRadio = document.getElementByName('gender');
		var checkCnt=0;
		for(var i=0; i<checkRadio.length;i++){
			if(checkRadio[i].checked==true)
				checkCnt++;
			if(checkCnt<1){
				alert("성별을 체크하세요.");
				document.frm.checkRadio[0].focus();
				return;
			}
		}
	}
}
<%@ taglib uri="/struts-tags" prefix="s"%>

<center>
<s:form action="updates">




			<s:textfield label="RollNo" name="studentForm.id" readonly="true"></s:textfield>
			<s:textfield label="Name" name="studentForm.name"></s:textfield>
			<s:textfield label="Password" name="studentForm.password"></s:textfield>
			<s:textfield label="Email" name="studentForm.email"></s:textfield>
			<s:textfield label="Address" name="studentForm.addr" ></s:textfield>


		
		<s:submit value="Update" />		
</s:form>
</center>
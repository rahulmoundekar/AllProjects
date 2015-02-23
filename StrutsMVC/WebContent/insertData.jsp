<%@ taglib uri="/struts-tags" prefix="s"%>

<s:form action="insert">
<center>
<s:textfield name="studentForm.id" label="RollNo :"></s:textfield>
<s:textfield name="studentForm.name" label="Name :"></s:textfield>
<s:textfield name="studentForm.password" label="Password :"></s:textfield>
<s:textfield name="studentForm.email" label="Email Address :"></s:textfield>
<s:textfield name="studentForm.addr" label="Address :"></s:textfield>
	<s:submit value="Add Data"></s:submit>
</center>
</s:form>

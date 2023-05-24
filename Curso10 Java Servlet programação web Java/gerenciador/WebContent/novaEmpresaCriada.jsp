
<%
//Scriplet
//Como o método getAttribute só pode ser usado com uma String, foi preciso fazer um casting
String nomeEmpresa = (String) request.getAttribute("empresa");
System.out.println(nomeEmpresa);
%>


<html>
<body>

	<%-- Empresa <% out.println(nomeEmpresa); %> com sucesso --%>

	Empresa
	<%=nomeEmpresa%>
	com sucesso!
	<!-- Forma simplificada -->


</body>
</html>
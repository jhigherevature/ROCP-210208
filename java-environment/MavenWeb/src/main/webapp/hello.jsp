<jsp:include page="header.jsp" />

<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<a href="http://localhost:8080/MavenWeb">
		<button>Back to Index</button>
	</a>

	<p>This came from the Servlet: ${testString}</p>

	<!-- The syntax below '<' and '%' is used to generate java code
		within your JSP -->
	<%
	int num = 3;
	%>

	<%
	switch (num) {
	case 1:
		out.println("The lonliest number");
		break;
	case 2:
		out.println("company!");
		break;
	case 3:
		out.println("a crowd");
		break;
	case 4:
		out.println("a party");
		break;
	default:
		out.println("That number is too high");
		break;
	}
	%>
</body>
</html>
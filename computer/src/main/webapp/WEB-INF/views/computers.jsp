<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<style>
#header {
    background-color:black;
    color:#FFA500;
    text-align:center;
    padding:5px;
font-family: 'comic sans ms', fantasy;
}

#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:410px;
    width:100px;
    float:left;
    padding:5px;
}
#section {
    width:550px;
    float:left;
    padding:10px;
 background-color:#eeeeee;
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
   padding:5px;

}
#entry {
    border-bottom-style: dotted;
   }
.funkyclass {
                 font: 36pt/40pt courier;
                 font-variant: small-caps;
                 border: thick dashed blue }
img {
    width: 80px;
    margin-right: 5px;
    margin-bottom: 5px;
    position: absolute;
}
.price_line {
     margin-left: 100px;
    margin-top: 0.5em;
    margin-bottom: 0.8em;
}
a {
   color: black;
    font-size: small;
}
body {
    background-color: #eeeeee;
}
</style>
</head>
<body>

<div id="header">
<h1>Welcome to our warehouse</h1>
</div>


<h2>Available Computers</h2>

<c:if test="${!empty computers}">
<c:forEach items="${computers}" var="computer">
<div id="section">
<div id="entry">
<div>${computer.name}</div>
<div>${computer.memory}</div>
<div>${computer.processor}</div>
<div class="price_line">
</div>
</div>
</c:forEach>
</c:if>

<c:if test="${empty computers}">
    <p>There are no computers yet in the warehouse. Please add them in the form below.</p>
</c:if>

<div class="form">

<form:form method="post" commandName="computer" role="form">
    Name: <form:input type="text" path="name" required="required" placeholder="Enter the computer's name"/></br>
    Memory: <form:input type="text" path="memory" required="required" placeholder="Enter the computer's memory"/></br>
    Processor: <form:input type="text" path="processor" required="required" placeholder="Enter the computer's processor"/></br>
    <p>
    <button type="submit">SAVE COMPUTER</button>
</form:form>
</div>

</body>
</html>
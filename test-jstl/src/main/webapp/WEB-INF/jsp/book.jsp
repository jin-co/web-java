<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="fn"
           uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    <c:set var="string1" value="This is first string"/>
    <c:if test="${fn:contains(string1, 'first')}">
    <p>Found 'first'
    <p>
        </c:if>

    <c:if test="${fn:endsWith(string1, 'string')}">
    <p>ends with 'string'
    <p>
    </c:if>

    <p>${fn:escapeXml(string1)}</p>

    <c:set var = "string3" value = "${fn:split(string1, ' ')}" />
    <c:out value="${string3}"/>
    <c:set var = "string4" value = "${fn:join(string3, '-')}" />
    <c:out value="${string4}"/>
</div>
</body>
</html>
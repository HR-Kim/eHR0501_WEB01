<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user_mng</title>
</head>
<body>
    <h3>user_mng</h3>
    <hr/>
    <form method="get" action="get_selectone.do">
        이름:<input type="text" name="name" size="15"><br/>
        성별:<input type="text" name="sex" size="15"><br/>
        전화:<input type="text" name="tel" size="15"><br/>
        나이:<input type="text" name="age" size="15"><br/>
       <input type="submit" value="전송"  />       
    </form>
    ${vo }
<c:if test="${vo != null}">
이름:${vo.name }<br/>
성별:${vo.sex }<br/>
전화:${vo.tel }<br/>
나이:${vo.getAge() }<br/>
</c:if>

</body>
</html>
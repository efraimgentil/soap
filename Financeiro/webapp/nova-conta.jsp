<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Nova conta</h1>
    
    <form method="post">
        <div>
            <label for="cedente">Cedente</label>
            <input id="cedente" name="cedente"   />
        </div>
        <div>
            <label for="descricao">Descricao</label>
            <input id="descricao" name="descricao"   />
        </div>
        <div>
            <label for="valor">Valor</label>
            <input id="valor" name="valor"   />
        </div>
        <div>
            <button type="submit">Cadastrar</button>
        </div>
    </form>
</body>
</html>

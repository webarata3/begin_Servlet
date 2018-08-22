<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>計算結果</title>
 </head>
 <body>
  <%= request.getParameter("add1") %> +
  <%= request.getParameter("add2") %> =
  <%= request.getAttribute("result") %>
 </body>
</html>

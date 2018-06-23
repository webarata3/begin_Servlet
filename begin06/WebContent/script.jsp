<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.List, java.util.ArrayList"%>
<%! int counter = 0; %>
<%
List<String> list = new ArrayList<>();
list.add("みかん");
list.add("りんご");
list.add("いちご");
%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="utf-8">
  <title>JSPのテスト</title>
 </head>
 <body>
カウンタ: <%= counter++ %><br>
<% for (String str : list) { %>
  <%= str %><br>
<% } %>
 </body>
</html>

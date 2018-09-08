<%-- 
    Document   : index
    Created on : 12/08/2018, 06:49:37 PM
    Author     : admin
--%>

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="login">
<s:textfield name="userDto.Name" label="Name"></s:textfield>
<s:password name="userDto.Password" label="Password"></s:password>
<s:submit value="login"></s:submit>
</s:form>
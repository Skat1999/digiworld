<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@page import="digiworld.store.CartUtils" %>

 <%
 	String LoggedIn = (String) session.getAttribute("logged");
     boolean logged_in; 
    
     if(LoggedIn == null)
     {
     	logged_in = false;
     } else { 
     	logged_in = true; 
     	
     	String SessionKey = (String) session.getAttribute("sessionkey");
     	int CartElements = CartUtils.getCartElements(SessionKey);
     	
     	pageContext.setAttribute("cartElements", CartElements);
    	}
     
     pageContext.setAttribute("logged_in", logged_in);
 %>
<c:if test="${logged_in}">
<li><a href="cart">Cart <span>(${cartElements})</span></a></li>
</c:if>
            
            
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

    <jsp:useBean id="silownia" class="com.silownia.servletsilownia.domain.Silownia"
        scope="session"></jsp:useBean>
 
    <jsp:setProperty property="*" name="silownia" />
 
    <!-- Ponowne użycie tagu jsp:useBean ładujący źródło danych. -->
    <jsp:useBean id="dataSource"
        class="com.example.servletsilownia.service.StorageService" scope="session"></jsp:useBean>
 
    <!-- Wyświetlenie nazwy użytkownika. -->
    Nazwa Cwiczenia: <%= silownia.getNazwaCwiczenia() %><br />
    Ciezar <%= silownia.getCiezar() %><br />
    Doswiadczenie <%= silownia.getDoswiadczenie() %><br />
    Sprzet <%= silownia.getSprzet() %><br />
    Miesnie <%= silownia.getPartieciala() %><br />
    <!-- Logika sprawdzająca poprawność parametrów logowania. -->
    <% String result = "Dane niepoprawne";
 
    %>
 
    <!-- Zwrócenie wynikowego stringa "result" -->
    <%= result %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Silownia</title>
</head>
<body>
<body>
  <form method="post" action="DataServlet.jsp">
        Podaj nazwe cwiczenia: <br />
        <input type="text" name="nazwaCwieczenia" /><br />
        Podaj wage ciezaru: <br />
        <input type="text" name="ciezar" /><br />
        Doswiadczenie: <br />
        Brak <input type="radio" name="doswiadczenie" value="Brak">
        Srednie <input type="radio" name ="doswiadczenie" value = "Srednie">
        Duze <input type="radio" name = "doswiadczenie" value = "Duze">
        <br/>
        Sprzet: <br/>
        Hantle <input type="checkbox" name="sprzet" value="Hantle">
        Sztanga <input type="checkbox" name="sprzet" value="Sztanga">
        Maszyny <input type="checkbox" name="sprzet" value="Maszyny">
        <br/>
        Laweczka <input type="checkbox" name="sprzet" value="Laweczka">
        Wyciag <input type="checkbox" name="sprzet" value="Wyciag">
        Bieznia <input type="checkbox" name="sprzet" value="Bieznia">
        <br/>
        <br/>
        Trening wybranych partii miesni:
        <br/>
        <br/>
        <select name ="miesnie" multiple="multiple">
        
    
         <option value="Triceps">Triceps</option>
         <option value="Biceps">Biceps</option>
         <option value = "Klatka Piersiowa">Klatka Piersiowa</option>
         <option value="Uda">Uda</option>
         <option value="Lydki">Lydki</option>
         <option value="Barki">Barki</option>
         <option value="Brzuch">Brzuch</option>
        
        </select>
        <br/>
        <br/>
         <input type="submit" value="Akceptuj">
    </form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
 <p> Calcul de mensualité </p><br>
 <form action="MVCservlet" method="post">
    
        <label for="montant">Montant :</label>
        <input type="text" id="montant" name="montant"><br>
        <label for="duree">Duree :</label>
        <input type="text" id="duree" name="duree"><br>
        <label for="effectif">taux effectif global annuel </label>
        <input type="text" id="taux" name="taux"><br>
        <input type="submit" value = "Calcul">
  </form>      
       <!-- try {
            String AH = (String)request.getAttribute("result");
               out.println(AH);
               } catch(Exception e )
            {
               	out.println("");
            }%> --> 
  
  <% String AH = (String)request.getAttribute("result");
               out.println(AH);%> 
</body>
</html>
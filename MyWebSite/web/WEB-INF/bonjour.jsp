
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bonjour Page</title>
    </head>
    <body>
        <%@include file='menu.jsp' %>
        <h1>Hello ${empty name ? '':name } 
            ${noms[0]}
            <%-- <%
            String nom= (String) request.getAttribute("name");
out.println(nom);%>! --%>
        </h1>
         <p>
             Tableau de nom:<br>
            <% 
                String[] names= (String[]) request.getAttribute("noms");
                for(int i=0;i<names.length;i++){
                out.println(names[i]+"<br>");
            }
            %>
        </p>
        <p>
            Nom de l'auteur: ${auteur.nom}
        </p>
         <p>
            Prenom de l'auteur: ${auteur.prenom}
        </p>
         <p>
            Activite de l'auteur: ${auteur.actif? 'Tres actif':'Pas actif'}
        </p>
    </body>
</html>

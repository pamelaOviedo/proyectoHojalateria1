<%-- 
    Document   : producto
    Created on : 03/09/2019, 05:06:46
    Author     : juanovioedo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>        
        <div class="d-flex">
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <form action="Controlador?menu=Producto" method="POST">
                            <div class="form-group">
                                <label>id</label>
                                 <input type="text" value="${producto.getid()}" name="txtid" class="form-control">
                            </div>
                                <label>idcategoria</label>
                                <input type="text" value="${producto.getidcategoria()}" name="txtcategoria" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>nchapa</label>
                                <input type="text" value="${producto.getnchapa()}" name="txtnchapa" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>color fabrica o artesanal</label>
                                <input type="text" value="${producto.getcolorfabricaoartesanal()}" name="txtcolorfabricaoartesanal" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>canaleta</label>
                                <input type="text" value="${producto.getcanaleta()}" name="txtcanaleta" class="form-control">
                          <div class="form-group">
                                <label>medidas</label>
                                <input type="text" value="${producto.getmedidas()}" name="txtmedidas" class="form-control">
                           <div class="form-group">
                                <label>precios</label>
                                <input type="text" value="${producto.getprecios()}" name="txtprecios" class="form-control">
                           <div class="form-group">
                               
                           </div>
                          
                          </div>
                            </div> 
                            
                            <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                            <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                        </form>
                    </div>                         
                </div>
            </div>                     
            <div class="col-sm-8">
                <div class="card">
                    <div class="card-body">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                       <th>id</th>
                                    <th>idcategoria</th>
                                    <th>nchapas</th>
                                    <th>colorfabricaoartesanal</th>                                    
                                    <th>canaleta</th>                                    
                                    <th>medidas</th>
                                    <th>precios</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="user" items="${lista2}">
                                    <tr>
                                        <td>${user.getid()}</td>                                      
                                        <td>${user.getidcategoria()}</td>
                                        <td>${user.getnchapa()}</td>
                                        <td>${user.getcolorfabricaoartesanal()}</td>   
                                        <td>${user.getcanaleta()}</td>
                                        <td>${user.getmedidas()}</td>   
                                        <td>${user.getprecios()}</td> 
                                        <td>
                                            <a class="btn btn-warning" href="Controlador?menu=Producto&accion=Editar&id=${pro.getId()}">Editar</a>
                                            <a class="btn btn-danger" href="Controlador?menu=Producto&accion=Delete&id=${pro.getId()}">Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>      
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>


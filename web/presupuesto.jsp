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
                                <label>presupuesto</label>
                                <input type="text" value="${producto.getNom()}" name="txtDni" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>idpresupuesto</label>
                                <input type="text" value="${idpresupuesto.getPre()}" name="txtNombres" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>detalle de cliente</label>
                                <input type="text" value="${presupuesto.getStock()}" name="txtTel" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>fecha</label>
                                <input type="text" value="${presupuesto.getEstado()}" name="txtEstado" class="form-control">
                          <div class="form-group">
                                <label>discripcion del trabajo</label>
                                <input type="text" value="${presupuesto.getdiscripciondeltrabajo()}" name="txtdiscripciondeltrabajo" class="form-control">
                            </div>                        
                            
                            <div class="form-group">
                                <label>total</label>
                                <input type="text" value="${presupuesto.gettotal()}" name="txttotal" class="form-control">
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
                                    <th>ID</th>
                                    <th>detalledelcliente</th>
                                    <th>fecha</th>
                                    <th>discripciondeltrabajo</th>                                    
                                    <th>total</th>                                    
                                   
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="user" items="${productos}">
                                    <tr>
                                        <td>${user.getId()}</td>                                      
                                        <td>${user.getdetalledelcliente()}</td>
                                        <td>${user.getfecha()}</td>
                                        <td>${user.getdiscripciondeltrabajo()}</td>
                                        <td>${user.gettotal()}</td>                                        
                                        <td>
                                            <a class="btn btn-warning" href="Controlador?menu=Presupuesto&accion=Editar&id=${em.getId()}">Editar</a>
                                            <a class="btn btn-danger" href="Controlador?menu=Presupuesto&accion=Delete&id=${em.getId()}">Delete</a>
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


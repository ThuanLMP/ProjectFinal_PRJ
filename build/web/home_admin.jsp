<%-- 
    Document   : newjsp
    Created on : Feb 27, 2022, 12:20:55 AM
    Author     : ITACHI
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Admin Manager</title>

        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->

        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/08353d1bef.js" crossorigin="anonymous"></script>


    </head>
    <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="admin/home">Admin Manager</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">

                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="./logout">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">Core</div>
                            <a class="nav-link" href="admin/home">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-house"></i></i></div>
                                MAIN
                            </a>
                            <div class="sb-sidenav-menu-heading">Function</div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-list"></i></i></div>
                                List
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">

                                    <a class="nav-link" href="order_active">Orders Active</a>
                                    <a class="nav-link" href="orders_expire">Orders Expire</a>
                                    <a class="nav-link" href="listacc">List Account</a> 

                                </nav>
                            </div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapsePages" aria-expanded="false" aria-controls="collapsePages">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-user"></i></i></div>
                                User
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapsePages" aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav accordion" >                                   
                                    <a class="nav-link" href="listUser">List User</a>                                                                                                      

                                </nav>
                            </div>

                        </div>

                </nav>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Manager Neflix Store</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Trần Văn Thuận</li>
                        </ol>
                        <div class="row">
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-primary text-white mb-4">
                                    <div class="card-body">Doanh thu hôm nay</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" style="text-decoration: none" href="#">${sessionScope.revtoday} VND</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-warning text-white mb-4">
                                    <div class="card-body">Doanh thu tháng này</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" style="text-decoration: none" href="#">${sessionScope.rev30day} VND</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-success text-white mb-4">
                                    <div class="card-body">Tổng doanh thu</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" style="text-decoration: none" href="#">${sessionScope.revall} VND </a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-danger text-white mb-4">
                                    <div class="card-body" >Tài khoản đã bán</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" style="text-decoration: none" href="#">${sessionScope.countOrder}</a>

                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-primary text-white mb-4">
                                    <div class="card-body">Lợi nhuận hôm nay</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" style="text-decoration: none" href="#">${sessionScope.profitday} VND</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-warning text-white mb-4">
                                    <div class="card-body">Lợi nhuận tháng này</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" style="text-decoration: none" href="#">${sessionScope.profit30day} VND</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-success text-white mb-4">
                                    <div class="card-body">Tổng lợi nhuận</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" style="text-decoration: none" href="#">${sessionScope.profitall} VND </a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-md-6">
                                <div class="card bg-danger text-white mb-4">
                                    <div class="card-body" >Tài khoản sắp hết hạn</div>
                                    <div class="card-footer d-flex align-items-center justify-content-between">
                                        <a class="small text-white stretched-link" style="text-decoration: none" href="#">${sessionScope.countOrderExpire}</a>

                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xl-2">
                                
                            </div>
                            <div class="col-xl-8">
                                <div class="card mb-4">
                                    <div class="card-header">
                                        <i class="fa-solid fa-circle-plus"></i>
                                        ADD NEW USER
                                    </div>

                                    <div class="card-body">

                                        <form class="validate-form" action="adduser" method="POST">
                                            <div class="wrap-input100 validate-input" data-validate = "Username is required" >
                                                <input class="input100" type="text" name="username" placeholder="User Name">
                                                <span class="focus-input100"></span>
                                                <span class="symbol-input100">
                                                    <i class="fa fa-user" aria-hidden="true"></i>
                                                </span>
                                            </div>

                                            <div class="wrap-input100 validate-input" data-validate = "Password is required">
                                                <input class="input100" type="password" name="password" placeholder="Password">
                                                <span class="focus-input100"></span>
                                                <span class="symbol-input100">
                                                    <i class="fa fa-lock" aria-hidden="true"></i>
                                                </span>
                                            </div>

                                            <div class="wrap-input100 validate-input" data-validate = "Fullname is required" >
                                                <input class="input100" type="text" name="fullname" placeholder="Full Name">
                                                <span class="focus-input100"></span>
                                                <span class="symbol-input100">
                                                    <i class="fa fa-user-circle" aria-hidden="true"></i>                                                
                                                </span>
                                            </div>
                                            <div class="wrap-input100 validate-input" data-validate = "Gmail is required" >
                                                <input class="input100" type="text" name="gmail" placeholder="Gmail">
                                                <span class="focus-input100"></span>
                                                <span class="symbol-input100">
                                                    <i class="fa fa-envelope" aria-hidden="true"></i>
                                                </span>
                                            </div>
                                            <div class="wrap-input100 validate-input" data-validate = "Phone is required" >
                                                <input class="input100" type="text" name="sdt" placeholder="Phone Number">
                                                <span class="focus-input100"></span>
                                                <span class="symbol-input100">
                                                    <i class="fa fa-phone" aria-hidden="true"></i>
                                                </span>
                                            </div>

                                            <div class="container-login100-form-btn">
                                                <button class="login100-form-btn">
                                                    ADD
                                                </button>
                                            </div>

                                        </form>

                                    </div>

                                </div>
                            </div>
                            


                        </div>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                Danh sách hóa đơn còn hoạt động
                            </div>
                            <div class="card-body">

                                <table id="datatablesSimple">
                                    <thead>
                                        <tr>
                                            <th>Full Name</th>
                                            <th>User Name</th>
                                            <th>Gmail User</th>
                                            <th>Phone Number</th>
                                            <th>Account Netflix</th>
                                            <th>Slot</th>
                                            <th>Start Date</th>
                                            <th>Time</th>
                                            <th>Type</th>
                                        </tr>
                                    </thead>

                                    <tfoot>
                                        <tr>
                                            <th>Full Name</th>
                                            <th>User Name</th>
                                            <th>Gmail User</th>
                                            <th>Phone Number</th>
                                            <th>Account Netflix</th>
                                            <th>Slot</th>
                                            <th>Start Date</th>
                                            <th>Time</th>
                                            <th>Type</th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <c:forEach items="${orders}" var="o">
                                            <tr>

                                                <td>${o.getFullname()}</td>
                                                <td>${o.getUsername()}</td>
                                                <td>${o.getGmail()}</td>
                                                <td>${o.getSdt()}</td>
                                                <td>${o.getAccNetf()}</td>
                                                <td>${o.getSlot()}</td>
                                                <td>${o.getStartDate()}</td>
                                                <td>${o.getTime()}</td>
                                                <td>${o.getType()}</td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>

                                </table>




                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Website design by Trần Văn Thuận</div>
                            <div>
                                <a href="#">Facebook</a>

                                <a href="#">Youtube</a>
                            </div>
                        </div>
                    </div>
                </footer>



            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="assets/demo/chart-area-demo.js"></script>
        <script src="assets/demo/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="js/datatables-simple-demo.js"></script>
        <!--===============================================================================================-->	
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/tilt/tilt.jquery.min.js"></script>
        <script >
            $('.js-tilt').tilt({
                scale: 1.1
            })
        </script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>

    </body>
</html>

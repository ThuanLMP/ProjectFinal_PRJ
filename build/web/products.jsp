<%-- 
    Document   : products
    Created on : Mar 13, 2022, 2:03:54 PM
    Author     : ITACHI
--%>

<%@page import="model.OrderCart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Products</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <style>
            .content {
                height: 200px;
                padding-top: 20px;
                background-color: azure;
            }

            img {
                height: 190px;
            }

            .bn11 {
                display: inline-block;
                padding: 0.5em 1.7em;
                margin: 0 0.1em 0.1em 0;
                border: 0.16em solid rgba(255, 255, 255, 0);
                background-color: rgb(80, 10, 172);
                border-radius: 2em;
                box-sizing: border-box;
                text-decoration: none;
                font-family: "Roboto", sans-serif;
                font-weight: 300;
                color: #ffffff;
                text-shadow: 0 0.04em 0.04em rgba(0, 0, 0, 0.35);
                text-align: center;
                transition: all 0.2s;
            }

            a.bn11:hover {
                border-color: rgb(255, 255, 255);
            }
        </style>
        <%
         
            OrderCart orderCart = (OrderCart)session.getAttribute("orderCart");
            if(orderCart ==null)
                orderCart = new OrderCart();
        %>
    </head>

    <body>
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <h2 class="navbar-brand">Netflix Store</h2>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                        aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="./home">Home</a></li>

                    </ul>
                    <form class="d-flex">
                        <button class="btn btn-outline-dark" type="submit">
                            <i class="bi-cart-fill me-1"></i>
                            Cart
                            <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
                        </button>
                    </form>
                </div>
            </div>
        </nav>
        <!-- Header-->
        <header class="card">

            <div class="text-center">
                <h4>TẠI SAO NÊN CHỌN CHÚNG TÔI</h4>
            </div>

            <div class="container-fluid text-center">
                <div class="row">

                    <div class="col-md-4 card text-info content">

                        <h5>Giá rẻ nhất</h5>
                        Cam kết giá rẻ nhất thị trường Việt Nam, chỉ với từ 60k/tháng rẻ gấp 4 lần so với giá gốc 260k/tháng
                    </div>

                    <div class="col-md-4 card text-warning content">
                        <h5>Chất lượng 4k</h5>
                        Cam kết chỉ bán tài khoản Netflix Premium 4K gói 3 tháng, 6 tháng Netflix chính chủ
                    </div>

                    <div class="col-md-4 card text-danger content">
                        <h5>Cam kết hài lòng</h5>
                        100% tài khoản Netflix chính chủ. Khách hàng sử dụng slot riêng biệt trên mỗi tk. Bảo hành 1 đổi 1.
                    </div>

                </div>
            </div>


        </header>

        <!-- Section-->
        <section class="py-5">
            <div class="container px-4 px-lg-5 mt-5">
                <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            <img class="card-img-top"
                                 src="https://cdn.divineshop.vn/image/catalog/Anh/Banner/NETFLIX1406.png?hash=1623646686"
                                 alt="..." />
                            <!-- Product details-->
                            <div class="card-body p-4">
                                <div class="text-center">
                                    <!-- Product name-->
                                    <h5 class="fw-bolder">7SHARE</h5>
                                    <!-- Product price-->
                                    32.000 đ/tháng
                                </div>
                            </div>
                            <!-- Product actions-->
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                <form action="products/cart" method="post">
                                    <input type="hidden" name="type" value="7SHARE"/>
                                    <div class="text-center"><input class="bn11" type="submit" value="Buy it"/></div>
                                </form>
                               
                            </div>
                        </div>
                    </div>
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            <img class="card-img-top"
                                 src="https://cdn.divineshop.vn/image/catalog/Anh/Banner/NETFLIX1406.png?hash=1623646686"
                                 alt="..." />
                            <!-- Product details-->
                            <div class="card-body p-4">
                                <div class="text-center">
                                    <!-- Product name-->
                                    <h5 class="fw-bolder">STANDARD</h5>
                                    <!-- Product price-->
                                    55.000 đ/ tháng
                                </div>
                            </div>
                            <!-- Product actions-->
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                 <form action="products/cart" method="post">
                                     <input type="hidden" name="type" value="STANDARD"/>
                                    <div class="text-center"><input class="bn11" type="submit" value="Buy it"/></div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            <img class="card-img-top"
                                 src="https://cdn.divineshop.vn/image/catalog/Anh/Banner/NETFLIX1406.png?hash=1623646686"
                                 alt="..." />
                            <!-- Product details-->
                            <div class="card-body p-4">
                                <div class="text-center">
                                    <!-- Product name-->
                                    <h5 class="fw-bolder">2-END</h5>
                                    <!-- Product price-->
                                    70.000 đ/tháng
                                </div>
                            </div>
                            <!-- Product actions-->
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                 <form action="products/cart" method="post">
                                     <input type="hidden" name="type" value="2-END"/>
                                    <div class="text-center"><input class="bn11" type="submit" value="Buy it"/></div>
                                </form>
                            </div>
                        </div>
                    </div>



                </div>

            </div>

        </section>
        
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container">
                <p class="m-0 text-center text-white">Contact: FACEBOOK - SDT: 0388684080</p>
            </div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>

</html>
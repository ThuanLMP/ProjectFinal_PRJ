<%-- 
    Document   : cart
    Created on : Mar 13, 2022, 8:32:02 PM
    Author     : ITACHI
--%>

<%@page import="model.OrderDetail"%>
<%@page import="model.OrderCart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Shopping Cart</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"">
        <link href=" https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/style.css">
        <style>
            .shopping-cart {
                padding-bottom: 50px;
                font-family: 'Montserrat', sans-serif;
            }

            .shopping-cart.dark {
                background-color: #f6f6f6;
            }

            .shopping-cart .content {
                box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);
                background-color: white;
            }

            .shopping-cart .block-heading {
                padding-top: 50px;
                margin-bottom: 40px;
                text-align: center;
            }

            .shopping-cart .block-heading p {
                text-align: center;
                max-width: 420px;
                margin: auto;
                opacity: 0.7;
            }

            .shopping-cart .dark .block-heading p {
                opacity: 0.8;
            }

            .shopping-cart .block-heading h1,
            .shopping-cart .block-heading h2,
            .shopping-cart .block-heading h3 {
                margin-bottom: 1.2rem;
                color: #3b99e0;
            }

            .shopping-cart .items {
                margin: auto;
            }

            .shopping-cart .items .product {
                margin-bottom: 20px;
                padding-top: 20px;
                padding-bottom: 20px;
            }

            .shopping-cart .items .product .info {
                padding-top: 0px;
                text-align: center;
            }

            .shopping-cart .items .product .info .product-name {
                font-weight: 600;
            }

            .shopping-cart .items .product .info .product-name .product-info {
                font-size: 14px;
                margin-top: 15px;
            }

            .shopping-cart .items .product .info .product-name .product-info .value {
                font-weight: 400;
            }

            .shopping-cart .items .product .info .quantity .quantity-input {
                margin: auto;
                width: 80px;
            }

            .shopping-cart .items .product .info .price {
                margin-top: 15px;
                font-weight: bold;
                font-size: 22px;
            }

            .shopping-cart .summary {
                border-top: 2px solid #5ea4f3;
                background-color: #f7fbff;
                height: 100%;
                padding: 30px;
            }

            .shopping-cart .summary h3 {
                text-align: center;
                font-size: 1.3em;
                font-weight: 600;
                padding-top: 20px;
                padding-bottom: 20px;
            }

            .shopping-cart .summary .summary-item:not(:last-of-type) {
                padding-bottom: 10px;
                padding-top: 10px;
                border-bottom: 1px solid rgba(0, 0, 0, 0.1);
            }

            .shopping-cart .summary .text {
                font-size: 1em;
                font-weight: 600;
            }

            .shopping-cart .summary .price {
                font-size: 1em;
                float: right;
            }

            .shopping-cart .summary button {
                margin-top: 20px;
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
            .button{
                padding-left: 100px;
                padding-right: 100px;
            }


            @media (min-width: 768px) {
                .shopping-cart .items .product .info {
                    padding-top: 25px;
                    text-align: left;
                }

                .shopping-cart .items .product .info .price {
                    font-weight: bold;
                    font-size: 22px;
                    top: 17px;
                }

                .shopping-cart .items .product .info .quantity {
                    text-align: center;
                }

                .shopping-cart .items .product .info .quantity .quantity-input {
                    padding: 4px 10px;
                    text-align: center;
                }
            }

        </style>
        <%
            OrderCart orderCart = (OrderCart) session.getAttribute("orderCart");
        %>
    </head>

    <body>
        <main class="page">
            <section class="shopping-cart dark">
                <div class="container">
                    <div class="block-heading">
                        <h2>Netflix Store</h2>
                        <p>Chất lượng hàng đầu Việt Nam</p>
                    </div>
                    <div class="content">
                        <div class="row">

                            <%
                                if (orderCart == null) {

                            %>
                            <div> Không có sản phẩm nào được chọn </div>
                            <div>
                                <a href="cart.jsp">Quay lại cửa hàng</a>
                            </div>
                            <% } else { %>

                            <div class="col-md-12 col-lg-8">
                                <div class="items">
                                    <div class="product">
                                        <%
                                            for (OrderDetail detail : orderCart.getDetails()) {
                                        %>

                                        <div class="row">
                                            <div class="col-md-2">

                                            </div>
                                            <div class="col-md-9">
                                                <div class="info">
                                                    <div class="row">
                                                        <div class="col-md-5 product-name">
                                                            <div class="product-name">
                                                                <a href="#"> Thông tin </a>
                                                                <div class="product-info">
                                                                    <div>Loại: <span class="value"><%= detail.getAccount().getType()%></span></div>
                                                                    <div>Giá: <span class="value"><%= detail.getAccount().getSalePrice()%></span></div>
                                                                    <div>Thời gian: <span class="value">1 Tháng</span></div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-2 quantity">
                                                            <label for="quantity">Tháng:</label>
                                                            <input id="quantity" type="number" value="<%= detail.getMonth()%>"
                                                                   class="form-control quantity-input">
                                                        </div>
                                                        <div class="col-md-3 quantity">
                                                            <label>Xóa SP</label>
                                                            <input  type="submit" value="Delete"/>

                                                        </div>

                                                        <div class="col-md-2 price">
                                                            <span><%=detail.getTotal()%> VND</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <%}%>

                                    </div>
                                </div>

                            </div>

                            <div class="col-md-12 col-lg-4">
                                <div class="summary">
                                    <h3>Hóa đơn</h3>
                                    <div class="summary-item"><span class="text">Số lượng tài khoản đã mua: </span><span
                                            class="price"><%=orderCart.count()%></span></div>
                                    <div class="summary-item"><span class="text">Giá tiền: </span><span
                                            class="price"><%= orderCart.getTotal()%> VND</span></div>
                                    <div class="summary-item"><span class="text">Giảm giá: </span><span
                                            class="price">0 VND</span></div>
                                    <div class="summary-item"><span class="text">Thành tiền: </span><span class="price"><%= orderCart.getTotal()%> VND</span>
                                    </div>
                                    <div>
                                        <form action="cart/payup" method="get">
                                            
                                            <input type="submit" class="btn btn-primary btn-lg btn-block" value="Thanh toán" />
                                        </form>
                                    </div>


                                </div>
                            </div>
                            <%}%>



                        </div>
                    </div>
                </div>
            </section>
            <div class="button">
                <a type="button" class="btn btn-primary btn-lg btn-block" href="products.jsp">Quay lại cửa hàng</a>
            </div>
        </main>
    </body>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>

</html>
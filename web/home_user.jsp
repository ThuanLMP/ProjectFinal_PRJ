<%-- 
    Document   : home_user
    Created on : Mar 8, 2022, 3:35:48 AM
    Author     : ITACHI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
            />
        <title>Netflix</title>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous"
            />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.8.1/font/bootstrap-icons.min.css"
            integrity="sha512-Oy+sz5W86PK0ZIkawrG0iv7XwWhYecM3exvUtMKNJMekGFJtVAhibhRPTpmyTj8+lJCkmWfnpxKgT2OopquBHA=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <style>
            html {
                overflow-x: hidden;
            }
            #header {
                padding: 0px 15vw;
                align-items: center;
                box-shadow: inset 0 0 0 2000px rgb(0 0 0 / 50%);
                background: url('./images/cover.jpg');
                background-size: cover;
                background-repeat: no-repeat;
                background-position: top;
                position: relative;
            }
            #quote-ava {
                max-height: 50px;
            }
            #main-home-content {
                transform: translateY(-17%);
            }
            #navbar {
                min-height: 88px;
                min-width: 100%;
                position: absolute;
                top: 0;
                left: 0;
                right: 0;
                display: flex;
                align-items: center;
                justify-content: flex-end;
                padding-right: 180px;
            }
            #header-logo {
                position: absolute;
                height: 36px;
                width: auto;
                bottom: 36px;
                user-select: none;
                -webkit-user-drag: none;
            }

            #login-btn {
                padding: 4px 16px;
                margin-left: 8px;
                /* position: absolute; */
            }

            #login-btn i {
                margin-right: 4px;
            }
            .hidden {
                display: none;
            }
        </style>

    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <!-- Header-->
            <header class="vh-100 row justify-content-center" id="header">
                <div class="container px-5">

                    <c:if test="${sessionScope.user!=null}">

                        <nav id="navbar">
                            <a
                                id="login-btn"
                                class="btn btn-secondary"
                                href="#"  
                                >
                                ${sessionScope.user.getUsername()}
                            </a>
                            <a
                                href="./logout"
                                id="login-btn"
                                class="btn btn-outline-secondary"
                                >
                                Logout
                            </a>
                        </nav>
                    </c:if>
                   

                    <c:if test="${sessionScope.user eq null}">

                        <nav id="navbar">
                            <a
                                id="login-btn"
                                class="btn btn-secondary"
                                href="./login"
                                >
                                Login
                            </a>
                            <a
                                href="./signup"
                                id="login-btn"
                                class="btn btn-outline-secondary"
                                >
                                Register
                            </a>
                        </nav>
                    </c:if>






                    <div
                        class="row gx-10 align-items-center justify-content-center"
                        id="main-home-content"
                        >
                        <div class="col-lg-8 col-xl-6 col-xxl-6">
                            <div class="my-5 text-center text-xl-start">
                                <h1
                                    class="display-5 fw-bolder text-white mb-2"
                                    style="font-size: 42px"
                                    >
                                    |𝗧𝗥𝗔𝗡𝗔𝗡𝗛 <br />|𝗣𝗥𝗘𝗠𝗜𝗨𝗠 𝗔𝗖𝗖𝗢𝗨𝗡𝗧
                                </h1>
                                <p class="lead fw-normal text-white-50 mb-4">
                                    Chúng tôi cung cấp tài khoản bản quyền uy
                                    tín,<br />
                                    chất lượng, giá tốt nhất!
                                </p>
                                <div
                                    class="d-grid gap-3 d-sm-flex justify-content-sm-center justify-content-xl-start"
                                    >
                                    <a
                                        class="btn btn-danger btn-lg px-4 me-sm-3"
                                        href="./home/products"
                                        >Mua ngay</a
                                    >
                                    <a
                                        href="#features"
                                        class="btn btn-outline-danger btn-lg px-4 me-sm-3"
                                        >
                                        Tìm hiểu thêm
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div
                            class="col-xl-6 col-xxl-6 d-none d-xl-block text-center"
                            ></div>
                    </div>
                </div>
                <img id="header-logo" src="./images/netflix.png" alt="" />
            </header>
            <!-- Features section-->
            <section class="py-5" id="features">
                <div class="container px-5 my-5">
                    <div class="row gx-5">
                        <div class="col-lg-4 mb-5 mb-lg-0">
                            <h2 class="fw-bolder mb-0">
                                Dịch vụ cho thuê <br />
                                tài khoản Netflix giá rẻ.
                            </h2>
                        </div>
                        <div class="col-lg-8">
                            <div class="row gx-5 row-cols-1 row-cols-md-2">
                                <div class="col mb-5 h-100">
                                    <div
                                        class="feature bg-primary bg-gradient text-white rounded-3 mb-3"
                                        >
                                        <i class="bi bi-collection"></i>
                                    </div>
                                    <h2 class="h5">Giá rẻ nhất</h2>
                                    <p class="mb-0">
                                        Cam kết giá rẻ nhất thị trường Việt Nam, chỉ với từ 32k/tháng so với giá gốc 260k/tháng
                                    </p>
                                </div>
                                <div class="col mb-5 h-100">
                                    <div
                                        class="feature bg-primary bg-gradient text-white rounded-3 mb-3"
                                        >
                                        <i class="bi bi-building"></i>
                                    </div>
                                    <h2 class="h5">Cam kết hài lòng</h2>
                                    <p class="mb-0">
                                        100% tài khoản Netflix chính chủ Việt Nam. Slot được tạo riêng biệt cho mỗi khách hàng. Bảo hành 1 đổi 1.
                                    </p>
                                </div>
                                <div class="col mb-5 mb-md-0 h-100">
                                    <div
                                        class="feature bg-primary bg-gradient text-white rounded-3 mb-3"
                                        >
                                        <i class="bi bi-toggles2"></i>
                                    </div>
                                    <h2 class="h5">Thưởng thức trên TV của bạn</h2>
                                    <p class="mb-0">
                                        Xem trên TV thông minh, Playstation, Xbox, Chromecast, Apple TV, đầu phát Blu-ray và nhiều thiết bị khác.
                                    </p>
                                </div>
                                <div class="col h-100">
                                    <div
                                        class="feature bg-primary bg-gradient text-white rounded-3 mb-3"
                                        >
                                        <i class="bi bi-toggles2"></i>
                                    </div>
                                    <h2 class="h5">Tải xuống xem ngoại tuyến</h2>
                                    <p class="mb-0">
                                        Tải xuống dễ dàng và xem ngoại tuyến tất cả các bộ phim yêu thích. Tiết kiệm dữ liệu tối đa.
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- Testimonial section-->
            <div class="py-5 bg-light">
                <div class="container px-5 my-5">
                    <div class="row gx-5 justify-content-center">
                        <div class="col-lg-10 col-xl-7">
                            <div class="text-center">
                                <div class="fs-4 mb-4 fst-italic">
                                    "Chúng tôi luôn cố gắng là đơn vị cung cấp
                                    dịch vụ tài khoản bản quyền tốt nhất, luôn
                                    có được sự tin tưởng của quý khách!"
                                </div>
                                <div
                                    class="d-flex align-items-center justify-content-center"
                                    >
                                    <img
                                        class="rounded-circle me-3"
                                        id="quote-ava"
                                        src="https://scontent.fhan5-4.fna.fbcdn.net/v/t1.6435-9/121706040_400498104674005_647580325258626460_n.jpg?_nc_cat=104&ccb=1-5&_nc_sid=174925&_nc_ohc=Cw6A_FtXMuUAX8VDgKp&_nc_ht=scontent.fhan5-4.fna&oh=00_AT9-7-tIsOzIvjJ2tlu-afhTrvDNb88VmX4wW4E8aS2XDQ&oe=625125B2"
                                        alt="..."
                                        />
                                    <div class="fw-bold">
                                        Trần Văn Thuận
                                        <span class="fw-bold text-primary mx-1"
                                              >/</span
                                        >
                                        CEO
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>

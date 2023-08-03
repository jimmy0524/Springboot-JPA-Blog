<%@ page language="java" contentType="text/html; charset=UTF-16"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
    <form action="/auth/loginProc" method="post">
       <div class="form-group">
          <label for="username">Username:</label>
          <input type="text" name="username" class="form-control" placeholder="Enter Username" id="username">
       </div>
    <div class="form-group">
        <label for="password">Password:</label>
         <input type="text" name="password" class="form-control" placeholder="Enter Password" id="password">
     </div>
     <div class="form-group form-check">
        <label class="form-check-label">
        <input name="remember" class="form-check-input" type="checkbox">Remember me
        </label>
    </div>
    <button id="btn-login" class="btn btn-primary">로그인</button>
    <a href="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=4509f8f89b6e82aac688e3e135005bd8&redirect_uri=http://localhost:8000/auth/kakao/callback"><img src="/image/kakao_login_medium.png"/></a>
</form>
</div>

<%@ include file="../layout/footer.jsp"%>
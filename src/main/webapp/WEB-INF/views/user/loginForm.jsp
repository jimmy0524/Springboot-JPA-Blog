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
</form>
</div>

<%@ include file="../layout/footer.jsp"%>
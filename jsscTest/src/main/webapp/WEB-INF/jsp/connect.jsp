<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/tags.jspf" %>
<!DOCTYPE html>
<html lang="kr">
<head>
	<%@ include file="../include/header.jspf" %>
</head>
<body>
<div class="container" id="main">
	<div class="col-md-12 col-sm-12 col-lg-10 col-lg-offset-1">
		<div class="panel panel-default qna-list">
			<ul class="list">



				<li>
					<div class="wrap">
						<div class="main">
							<strong class="subject">::현재상태::
							</strong>
							<div class="auth-info">
								<i class="icon-add-comment">${temperature}</i>
							</div>
							<div class="reply" title="댓글">
								<i class="icon-reply"></i>
								<span class="point">${each.countOfComment}</span>
							</div>
						</div>
					</div>
				</li>
			</ul>
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6 text-center">
					<ul class="pagination center-block" style="display:inline-block;">
						<li><a href="/connect?str=1">1</a></li>
						<li><a href="/connect?str=2">2</a></li>
						<li><a href="/connect?str=3">3</a></li>
						<li><a href="/connect?str=4">4</a></li>
						<li><a href="/connect?str=5">5</a></li>
						<li><a href="/connect?str=6">6</a></li>
						<li><a href="/connect?str=7">7</a></li>
						<li><a href="/connect?str=8">8</a></li>
						<li><a href="/connect?str=9">9</a></li>
						<li><a href="/connect?str=0">0</a></li>
					</ul>
				</div>
				<div class="col-md-3 qna-write">
					<a href="/questions/new" class="btn btn-primary pull-right" role="button">질문하기</a>
				</div>
			</div>
		</div>
	</div>
</div>

<%@ include file="../include/footer.jspf" %>
</body>
</html>
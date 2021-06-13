<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pageable Practice</title>
<script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU=" crossorigin="anonymous"></script>
</head>
<style>
table{
margin:auto width:90%
}
#pTitle{
background-color: yellow;
}
#prouctListTitle{
margin:auto;
font-size:25px;
font-weight: bold;
text-align:center;
}

</style>
<script > 
$(document).ready(function(){
	loadPageable(1);
}
		
);
function change(page){
	loadPageable(page);s
}
function loadPageable(indexPage){
// 	alert("success");
	$.ajax({
		type:"post",
		url:"examplePageable/" + indexPage,
		dataType:"JSON",
		contentType:"application/jaon",
		success:function(data){
			var json = JSON.stringify(data);
			var parseObjJson = JSON.parse(json);
			$('#showProduct').empty("");
			if(json=null){
				$('table').prepend("<tr><td colspan='2'>暫無資料<td><tr>");
			}else{
				var table=$('#showProduct');
				table.append("<tr id='pTitle'><th>ID</th><th>Product Name</th><th>Product Price</th><th>Quantity</th></tr>")
				$.each(parseObjJson, function(i,n){
					var tr ="<tr align='center'>" + "<td>" + n.pID + "</td>" +
					"<td>" + n.pNname + "</id>" + "<td>" + n.pPrice + "</td>" +
					"<td>" + n.pQuantity + 
					"</tr>";
					table.append(tr);
				});
			}
		},
		error:function(thrownError){
			console.log(thrownError);
		}
	})

}

</script>
<body>
	
	<div id="productListTitle"><h1>Here is the Table</h1></div>
	<table id="showProduct" border="1"></table>
	<table id="showPage" >
		<tr><td >Pages: ${totalPages} Elements: ${totalElements}</td>
			<td  align="right">Previous <c:forEach var="i" begin="1" end= "${totalPages}" step="1">
			<button id = "myPage" value = "${i}" onclick="change(${i})">${i}</button>
			</c:forEach>Next</td>
		</tr>
	</table>
	
	
</body>
</html>
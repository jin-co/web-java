<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>1조 데모 프로젝트</title>
    <link href="./lib/bootstrap-5.0.2-dist/css/bootstrap.css" rel="stylesheet">
    <script src="./lib/bootstrap-5.0.2-dist/js/bootstrap.js"></script>
    <script src="http://code.jquery.com/jquery-latest.js"></script>


    <style>
        .empty-10 {
            height: 10px;
            line-height: 10px;
        }

        .empty-20 {
            height: 20px;
            line-height: 20px;
        }

        .empty-30 {
            height: 30px;
            line-height: 30px;
        }

        .empty-40 {
            height: 40px;
            line-height: 40px;
        }

        .empty-50 {
            height: 50px;
            line-height: 50px;
        }

        .text-center {
            text-align: center;
        }

        .text-right {
            text-align: right;
        }

        .text-left {
            text-align: left;
        }

    </style>

    <style>
     /* Style #1 */
     .loading_wrapper {
		  display: flex;
		  justify-content: center;
		  align-items: center;
		  min-height: 100vh;
		}
		.loading {
		  display: flex;
		  justify-content: center;
		}
		
		.loading--full-height {
		  align-items: center;
		  height: 100%;
		}
		
		.loading::after {
		  content: "";
		  width: 50px;
		  height: 50px;
		  border: 10px solid #dddddd;
		  border-top-color: #009579;
		  border-radius: 50%;
		  transform: rotate(0.16turn);
		  animation: loading 1s ease infinite;
		}
		
		@keyframes loading {
		  /* Safari support */
		  from {
		    transform: rotate(0turn);
		  }
		  
		  to {
		    transform: rotate(1turn);
		  }
		}
    </style>


    <script type="text/javascript">
    $(window).load(function() {
    	
        $('.loading_wrapper').fadeOut();
    });

    </script>


</head>
<div class="loading_wrapper" >
  <div class="loading loading--full-height"></div>
</div>
    
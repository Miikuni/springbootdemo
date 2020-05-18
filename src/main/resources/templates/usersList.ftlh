<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>
            <th>Name</th>
            <th>Sex</th>
            <th>Age</th>
        </tr>
        <#--#list代表要遍历集合 list参数是UsersController传递过来的list( model.addAttribute("list",list) 里面的"list")  -->
        <#list list as user>
        <tr>
            <td>${user.name}</td>
            <td>${user.sex}</td>
            <td>${user.age}</td>
        </tr>
        </#list>
    </table>
</body>
</html>

<script type="text/javascript">
  var returnData = [];
  $.ajax({
    url: "/webservices/admin/users",
    type: "GET",
    dataType: "json",
    success: function (data) {
         returnData = data;
         for (var x = 0; x < data.length; x++) {
            $('#user-list-table').append('<tr><td>'+returnData[x].uuid+'</td><td>'+returnData[x].userName+'</td><td>'+returnData[x].firstName+'</td><td>'+returnData[x].lastName+'</td></tr>');
         }
    }
  });
</script>
<div class="box col-md-12">
            <div class="box-inner">
                <div class="box-header well" data-original-title="">
                    <h2>Striped Table</h2>
                </div>
                <div class="box-content">
                    <table class="table table-striped" id="user-list-table">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>Username</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                        </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
            </div>
</div>
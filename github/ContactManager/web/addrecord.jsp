<%@include file="header.jsp" %>
<h2>Add Record</h2>
<form method="post" action="save.jsp">
    <div class="form-group">
        <label>Name</label>
        <input type="text"  class="form-control" required="required" name="name" placeholder="Enter the Name" />   
    </div>
    <div class="form-group">
        <label>Email</label>
        <input type="email"  class="form-control" required="required" name="email" placeholder="Enter Email"/>
    </div>
    <div class="form-group">
        <label>Phone</label>
        <input type="tel"   class="form-control" required="required" name="phone" placeholder="Enter Contact number" />
    </div>
    <div class="form-group">
        <label>Address</label>
        <input type="text"   class="form-control" required="required" name="address" placeholder="Enter address"/>  
    </div>
    <div class="form-group">
        <label>Date Of Birth</label>
        <input type="date" class="form-control" required="required" name="dob" placeholder="Enter Date of Birth"/>
               </div>
               <div class="pull-right"><input type="hidden" name="id"/>
                 <button type="submit" class="btn btn-success "><span class="glyphicon glyphicon-floppy-save"></span>Save</button>
                  <a class="btn btn-warning " href="index.jsp?cancel"><span class="glyphicon glyphicon-remove"></span>Cancel</a> 
    </div>    
</form>
<%@include file="footer.jsp" %>

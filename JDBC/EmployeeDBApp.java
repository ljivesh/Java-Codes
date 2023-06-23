import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class driver
{
Connection conn;
Statement st;
driver()
{
try{
Class.forName("com.mysql.jdbc.driver");

conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false","root","Menma@mysql");

st=conn.createStatement();
}
catch(Exception e)
{e.printStackTrace();
}
}
public String retrieve()
{
String s="";
try
{
ResultSet rs=st.executeQuery("Select * from employees;");
while(rs.next())
{

s=s+rs.getString("emp_id")+","+rs.getString("emp_name")+","+rs.getString("emp_salary")+",";

}
}
catch(Exception e)
{
e.printStackTrace();
}
return s;
}
public void add(int id, String name,String salary)
{
try
{
st.executeUpdate("insert into employeesvalues("+id+",'"+name+"',"+salary+");");

}
catch(Exception e)
{
e.printStackTrace();
}
}
public void delete(int id)
{
try{
st.executeUpdate("delete from employees where emp_id="+id);
}
catch(Exception e){
e.printStackTrace();
}
}
public void update(int id, String salary)
{
try{
st.executeUpdate("update employees setemp_salary='"+salary+"'where emp_id="+id);

}
catch(Exception e)
{
e.printStackTrace();
}
}
}
class Main extends Frame{
Label l1,l2,l3,l4;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
Main()
{
l1=new Label("Employee Id: ");
l2=new Label("Employee Name: ");
l3=new Label("Employee Salary: ");
l4=new Label();
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("Insert");
b2=new Button("Delete");
b3=new Button("Update");
b4=new Button("Retrieve");
setLayout(null);
l1.setBounds(10,50,150,30);

l2.setBounds(10,100,150,30);
l3.setBounds(10,150,150,30);
l4.setBounds(20,270,250,100);
t1.setBounds(170,50,150,30);
t2.setBounds(170,100,150,30);
t3.setBounds(170,150,150,30);
b1.setBounds(20,200,60,30);
b2.setBounds(150,200,100,30);
b3.setBounds(20,250,60,30);
b4.setBounds(150,250,100,30);
add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
new

driver().add(Integer.parseInt(t1.getText()),t2.getText(),t3.getText());

l4.setText("Inserted successfully");

}
});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
new driver().delete(Integer.parseInt(t1.getText()));
l4.setText("Deleted successfully");

}
});
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
new

driver().update(Integer.parseInt(t1.getText()),t3.getText());

l4.setText("Updated successfully");

}
});
b4.addActionListener(new ActionListener()

{
public void actionPerformed(ActionEvent e)
{

l4.setText(new driver().retrieve());

}
});
setSize(350,350);
setLayout(null);
setVisible(true);
}
public static void main(String[] args) {
Main m=new Main();
}
}
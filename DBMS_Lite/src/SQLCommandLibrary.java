/*+----------------------------------------------------------------------
 ||
 ||  Class: 
 ||
 ||         Author: Steven Broussard (stevenwbroussard@email.arizona.edu)
 ||
 ||        Purpose: Library of SQL Command set up as though they are Java
 ||                 commands. Some will be a whole query as a String, because
 ||                 of the complexity of the query.
 ||
 ||  Inherits From: 
 ||
 ||     Interfaces: none
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Constants: 
 ||
 |+-----------------------------------------------------------------------
 ||
 ||   Constructors: none
 ||
 ||  Class Methods: 
 ||
 ||  Inst. Methods: 
 ||
 ++-----------------------------------------------------------------------*/

public class SQLCommandLibrary {
//TODO: Make command methods for the SQL commands
public String createTable(String fileName) {
	String createATable = "create table " + fileName + "("
			              + "distNum   integer,\n"
			              + "schoolNum integer,\n"
			              + "distName  varchar2(30),\n"
			              + "schName   varchar2(30),\n"
			              + "totNumEn  integer,\n"
			              + "perNoTest float,\n"
			              + "numMin    integer,\n"
			              + "perMin    float,\n"
			              + "numBasic  integer,\n"
			              + "perBasic  float,\n"
			              + "numPro    integer,\n"
			              + "perPro    float,\n"
			              + "numAdvan  integer,\n"
			              + "perAdvan  float,\n"
			              + ")";
	return createATable;
}
//TODO: Make command methods of SQL queries
}

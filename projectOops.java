package A2Z_application;
import java.util.*;
interface phonepay 
{
	
	static Random s=new Random();
	void bill(String phno);
	
	
}		


class mail 
{
        static String RESET  = "\u001B[0m";       //we have colors in 1 - bold 5 blink and varieties ,21 for underline and then 30 to 37 normal colors
	                                        //101-107 bckground colors
         static String BLACK  = "\u001B[30m";
         static String RED    = "\u001B[31m";
         static String GREEN  = "\u001B[32m";
         static String YELLOW = "\u001B[33m";
         static String BLUE   = "\u001B[34m";
         static String PURPLE = "\u001B[35m";
         static String CYAN   = "\u001B[36m";
         static String WHITE  = "\u001B[37m";
         static String backred="\u001B[101m";
         static String backGREEN="\u001B[102m";
         static String backYELLOW="\u001B[103m";
         static String backBLUE="\u001B[104m";
         static String backPURPLE="\u001B[105m";
         static String bacKCYAN="\u001B[106m";
         static String backWHITE="\u001B[107m";
         static String ul="\u001B[21m";
         static String blink="\u001B[5m";
         static String bold="\u001B[50m";
	static Scanner sc=new Scanner(System.in);
	private static String mailid="sai123@gmail.com";
	void setmailid(String mailid)
	{
		this.mailid=mailid;
	}
	static String getmailid()
	{
		return mailid;
	}
	static int show(int otp)
	{
		System.out.println("\t\t\t\tYOUR OTP FOR PHONEPAY MOBILE NUMBER VALIDATION = "+otp+"");
		System.out.println();
		return otp;
	}
}
class bank extends mail
{
	private String accno="234567897421";
	private String ifc="SBIN00123";
	private int pin=321456;	
	private String debit="4321876556781234";
	private int cvv=243;
	private String date ="20122028";
	private String phno="6301194177";
	String getaccno()
	{
		return accno;
	}
	String getifc()
	{
		return ifc;
	}
	int getpin()
	{
		return pin;
	}
	String getdebit()
	{
		return debit;
	}
	int getcvv()
	{
		return cvv;
	}
	String getdate()
	{
		return date;
	}
	String getphno()
	{
		return phno;
	}
	static int show2(int otp)
	{
		System.out.println("\t\t\t\tYOUR OTP FOR MOBILE NUMBER VALIDATION = "+otp+"");
		System.out.println();
		return otp;
	}
	
	
}
		
	
	
	
	
class A2Z extends bank implements phonepay
{
	public void bill(String phno)
	{
		if(phno.equals(getphno()))
		{
			System.out.println(BLUE+"\t\t\t\tWELCOME TO PHONEPAY"+RESET);
			System.out.println();
			System.out.println("\t\t\t\tENTER OTP SENT TO YOUR MOBILE NUMBER");
			System.out.println();
			int OTP=s.nextInt(1000)+9999;
			int otp=show2(OTP);
			int tpo=sc.nextInt();
			if(tpo==otp)
			{
				System.out.println("\t\t\t\tYOUR MOBILE NUMBER VERIFIED SUCCESSFULLY");	
				System.out.println();
				System.out.println("\t\t\t\tENTER YOUR UPI PIN");
				System.out.println();
				int PIN=sc.nextInt();
				if(PIN==getpin())
				{
				System.out.println("\t\t\t\tORDER PLACED SUCCESSFULLY");
				System.out.println();
				System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
				int d=sc.nextInt();
                                System.out.print("\t\t\tLoading");
                 try
	{
		for(int i = 1;i<=5;i++)
		{	
			Thread.sleep(1000);
			System.out.print(". ");
		}
                System.out.println("");
		System.out.println();
	}
        catch(Exception e)
	{}
				if(d==1)
				{	
					dashboard();
				}
				else
				{
					System.out.println("\t\t\t\tTHANK YOU");
					System.out.println();
				}	
				}
			}
		}
	}
	private String password="sai123";
	private long mobileNo=986632957;
	void setpassword(String password)
	{
		this.password=password;
	}
	void setmobileNo(long mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	String getpassword()
	{
		return password;
	}
	long getmobileNo()
	{
		return mobileNo;
	}
	void dashboard()
	{
		/*System.out.println("\t\t\t\tENTER 1 FOR FASHION");
		System.out.println("\t\t\t\tENTER 2 FOR ELECTRONICS");
		System.out.println("\t\t\t\tENTER 3 FOR TICKET BOOKING");
		System.out.println("\t\t\t\tENTER 4 FOR BILL PAYMENTS");
		int s1=sc.nextInt();
		if(s1==1)*/
		{
			fashion();
		}
	}
	int amount=0;
	int quantity=0;
	String namepd="";
	void cart(int Amount,String pdname)
	{
		System.out.println(pdname);
		System.out.println();
		System.out.println("\t\t\t\tTOTOAL AMOUNT = "+Amount+" ");
		System.out.println();
		if(Amount>0)
		{
			System.out.println("\t\t\t\tENTER 1 TO BUY");
			System.out.println();
			System.out.println("\t\t\t\tENTER 2 TO CONTINUE SHOPPPING");
			System.out.println();
			int s=sc.nextInt();
			if(s==1)
			{
				System.out.println("\t\t\t\tENTER 1 FOR PHONEPAY");
				System.out.println();
				System.out.println("\t\t\t\tENTER 2 TO CONTINUE SHOPPPING ");
				System.out.println();
				System.out.println("\t\t\t\tENTER 2 FOR DEBIT CARD");
				int s1=sc.nextInt();
				if(s1==1)
				{
					System.out.println("\t\t\t\tENTER YOUR YOUR MOBILE NUMBER");	
					System.out.println();
					String bno=sc.next();
					bill(bno);
				}
				else
				{
					dashboard();
				}
			}
			else if(s==2)
			{
				dashboard();
			}
		}
		else
		{
			System.out.println("\t\t\t\tNO PRODUCTS IN YOUR CART ");
			System.out.println();
			dashboard();
		}
		

	}
		
	void fashion()	
	{
		System.out.println("\t\t\t\tENTER 1 FOR MENS WEAR");
		System.out.println();
		System.out.println("\t\t\t\tENTER 2 FOR WOMENS WEAR ");
		System.out.println();
		System.out.println("\t\t\t\tENTER 3 FOR KIDS WEAR");
		System.out.println();
		int s2=sc.nextInt();
                 System.out.print("\t\t\tLoading");
                 try
	{
		for(int i = 1;i<=5;i++)
		{	
			Thread.sleep(1000);
			System.out.print(". ");
		}
                System.out.println("");
		System.out.println();
	}
        catch(Exception e)
	{}
		if(s2==1)
		{
			menswear();
		}
		else if(s2==2)
		{
			womenswear();
		}
		else
		{
			kidswear();
		}	
		
		
	}
		void menswear()
		{
			System.out.println("\t\t\t\tMENS WEAR SECTION");
			System.out.println();
			System.out.println("\t\t\t\tENTER 1 FOR SHIRTS & TSHIRTS SECTION");
			System.out.println();
			System.out.println("\t\t\t\tENTER 2 FOR PANTS SECTION");
			System.out.println();
			
			int s2=sc.nextInt();
			
			if(s2==1)
			{
				
				System.out.println("\t\t\t\tSHIRTS SECTION");
				System.out.println();
				System.out.println("\t\t\t\tCasual Shirt");
				System.out.println("\t\t\t\tJUST RUPEES OF 1000 /-");
				int p1 =1000;
				String sh1="CASUAL SHIRT";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 1");	
				System.out.println("\t\t\t\tFormal Shirt");
				System.out.println("\t\t\t\tJUST RUPEES OF 1500 /-");
				int p2=1500;
				String sh2="FORMAL SHIRT";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 2");
				System.out.println("\t\t\t\tBlazers");
				System.out.println("\t\t\t\tJUST RUPEES OF 5000 /-");
				int p3=5000;
				String sh3="Blazer";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 3 ");
				System.out.println("\t\t\t\tT-Shirt");
				System.out.println("\t\t\t\tJUST RUPEES OF 500 /-");
				int p4=500;
				String sh4="T-Shirt";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 4");
				System.out.println("\t\t\t\tSuits");
				System.out.println("\t\t\t\tJUST RUPEES OF 10000 /-");
				int p5=1000;
				String sh5="Suit";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 5");
				int select1=sc.nextInt();
				if(select1==1)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p1;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh1+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==2)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p2;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"<----- "+sh2+"*"+qty2+"  of size  "+s1+" ----->";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==3)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("<---------- ENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p3;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh3+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2 ");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER 3");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==4)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p4;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh4+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER 3");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==5)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p5;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh5+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2 ");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 3");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
			}
			if(s2==2)
			{
				
				System.out.println("<---------- PANTS & SHORTS SECTION ---------->");
				System.out.println();
				System.out.println("\t\t\t\tJeans");
				System.out.println("\t\t\t\tJUST RUPEES OF 1499 /-");
				int p1 =1499;
				String sh1="Jeans";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 1");	
				System.out.println("\t\t\t\tCasual Trouser");
				System.out.println("\t\t\t\tJUST RUPEES OF 1699 /-");
				int p2=1699;
				String sh2="Casual Trouser";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 2");
				System.out.println("\t\t\t\tFormal Trouser ");
				System.out.println("\t\t\t\tJUST RUPEES OF 1999 /-");
				int p3=5000;
				String sh3="Formal Trouser";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 3");
				System.out.println("\t\t\t\tShort");
				System.out.println("\t\t\t\tJUST RUPEES OF 499 /-");
				int p4=499;
				String sh4="Short";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 4");
				System.out.println("\t\t\t\tTrackpant");
				System.out.println("\t\t\t\tJUST RUPEES OF 10000 /-");
				int p5=2999;
				String sh5="Trackpant";
				System.out.println("TO ADD THIS PRODUCT TO CART ENTER 5");
				int select1=sc.nextInt();
				if(select1==1)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p1;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh1+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2 ");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 3");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==2)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p2;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh2+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2 ");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==3)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p3;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh3+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2 ");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2 ");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==4)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p4;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh4+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2 ");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==5)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p5;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh5+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2 ");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						menswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
			}
		}
		void womenswear()
		{
			System.out.println("\t\t\t\tWOMENS WEAR SECTION");
	
				System.out.println();
				System.out.println("\t\t\t\tKurta");
				System.out.println("\t\t\t\tJUST RUPEES OF 1999 /-");
				int p1=1999;
				String sh1="Kurta";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 1");	
				System.out.println("\t\t\t\tSaree ");
				System.out.println("\t\t\t\tJUST RUPEES OF 1499 /-");
				int p2=1499;
				String sh2="Saree";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 2");
				System.out.println("\t\t\t\tLehanga ");
				System.out.println("\t\t\t\tJUST RUPEES OF 2999 /- ");
				int p3=2999;
				String sh3="Lehanga";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 3");
				System.out.println("\t\t\t\tGown");
				System.out.println("\t\t\t\tJUST RUPEES OF 499 /-");
				int p4=499;
				String sh4="Gown";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 4");
				int select1=sc.nextInt();
				if(select1==1)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p1;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh1+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						womenswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==2)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p2;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh2+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						womenswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==3)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p3;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh3+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						womenswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==4)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p4;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh4+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						womenswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
		}
		void kidswear()	
		{
			System.out.println("\t\t\t\tKIDS WEAR SECTION");
			System.out.println();
			System.out.println("\t\t\t\tENTER 1 FOR BOYS");
			System.out.println("\t\t\t\tENTER 2 FOR GIRS");
			System.out.println("\t\t\t\tENTER ANY NUMBER FOR DASHBOARD EXCEPT 1 & 2");
			int s2=sc.nextInt();
			if(s2==1)
			{
				
				System.out.println("\t\t\t\tBOYS SECTION");
				System.out.println("\t\t\t\tT-Shirt");
				System.out.println("\t\t\t\tJUST RUPEES OF 199 /- ");
				int p1 =199;
				String sh1="T-Shirt";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 1");	
				System.out.println("\t\t\t\tJeans  -----_->");
				System.out.println("\t\t\t\tJUST RUPEES OF 499 /-");
				int p2=499;
				String sh2="Jeans";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 2");
				System.out.println("\t\t\t\tShirt");
				System.out.println("\t\t\t\tJUST RUPEES OF 5000 /-");
				int p3=399;
				String sh3="Shirt";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 3");
				int select1=sc.nextInt();
				if(select1==1)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p1;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh1+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						kidswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==2)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE ");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p2;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh2+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1 ");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2 ");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2 ");
					int s3=sc.nextInt();
					if(s3==1)
					{
						kidswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==3)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p3;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh3+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY]");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2 ");
					int s3=sc.nextInt();
					if(s3==1)
					{
						kidswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
			}
			if(s2==1)
			{
				
				System.out.println("\t\t\t\tGIRLS");
				System.out.println();
				System.out.println("\t\t\t\tGown");
				System.out.println("\t\t\t\tJUST RUPEES OF 999 /-");
				int p1=199;
				String sh1="Gown";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 1 ");	
				System.out.println("\t\t\t\tLehanga -----_->");
				System.out.println("\t\t\t\tJUST RUPEES OF 1499 /- ");
				int p2=1499;
				String sh2="Lehanga";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 2");
				System.out.println("\t\t\t\tT-Shirt  -----_->");
				System.out.println("\t\t\t\tJUST RUPEES OF 399 /-");
				int p3=399;
				String sh3="T-Shirt";
				System.out.println("\t\t\t\tTO ADD THIS PRODUCT TO CART ENTER 3 ");
				int select1=sc.nextInt();
				if(select1==1)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p1;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh1+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						kidswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==2)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p2;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t "+sh2+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2");
					int s3=sc.nextInt();
					if(s3==1)
					{
						kidswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
				else if(select1==3)
				{
					System.out.println("\t\t\t\tENTER YOUR SIZE");	
					String s1=sc.next();
					System.out.println("\t\t\t\tENTER QUANTITY");
					int qty1=sc.nextInt();
					amount=amount+qty1*p3;
					String qty2=String.valueOf(qty1);
					namepd=namepd+"\t\t\t\t"+sh3+"*"+qty2+"  of size  "+s1+"";	
					System.out.println("\t\t\t\tADDED TO CART SUCCESSFULLY");
					System.out.println("\t\t\t\tTO CONTINUE SHOPPING ENTER 1");
					System.out.println("\t\t\t\tTO GO TO CART ENTER 2 ");
					System.out.println("\t\t\t\tTO GO TO DASHBOARD ENTER ANY NUMBER EXCEPT 1 & 2 ");
					int s3=sc.nextInt();
					if(s3==1)
					{
						kidswear();
					}
					else if(s3==2)
					{
						cart(amount,namepd);
					}
					else 
					{
						dashboard();
					}
									
				}
			}
	}		
		
		
}
class user extends A2Z
{
	static Random r=new Random();
	static A2Z obj=new A2Z();
	static 
	{
		System.out.println(BLUE+blink+"\t\t\t\tWELLCOME TO "+RESET+RED+"A"+RESET+BLUE+blink+"2"+RESET+RED+"Z"+RESET);
		System.out.println();
        System.out.print("\t\t\tLoading");
                 try
	{
		for(int i = 1;i<=5;i++)
		{	
			Thread.sleep(1000);
			System.out.print(". ");
		}
                System.out.println("");
		System.out.println("");

	}
        catch(Exception e)
	{}
	}
	static void login()
	{
		System.out.println("\t\t\t\tENTER YOUR MOBILE NUMBER");
		System.out.println();
		long MOBILENO=sc.nextLong();
		System.out.println();
		System.out.println("\t\t\t\tENTER YOUR PASSWORD");
		System.out.println();
		String PASSWORD=sc.next();
		
		if((MOBILENO==obj.getmobileNo()) && PASSWORD.equals(obj.getpassword()))
		{
			
			System.out.println(GREEN+"\t\t\t\tA2Z login sucessfull "+RESET);
			System.out.println();
			
			obj.dashboard();
			
		}
		else if((MOBILENO!=obj.getmobileNo()) && PASSWORD.equals(obj.getpassword()))
		{
			resetNo();
		}
		else if((MOBILENO==obj.getmobileNo()) && !PASSWORD.equals(obj.getpassword()))
		{
			resetPassword();
		}
		else
		{
			System.out.println("\t\t\t\tINVALID MOBILE NUMBER AND INVALID USERID PLEASE ENETER AGAIN");
			System.out.println();
			login();
		}	
	}
	static void resetNo()
	{
		int i;
		for(i=1;i<=2;i++)
		{
			System.out.println("\t\t\t\tINVALID MOBILE NUMBER PLEASE ENETER AGAIN");
			System.out.println();
			long MOBILENO=sc.nextLong();
			if(MOBILENO==obj.getmobileNo())
			{
				System.out.println(GREEN+"\t\t\t\t A2Z login sucessfull"+RESET);
				System.out.println();
				obj.dashboard();
				break;	
			}
		}
		if(i>2)
		{
			System.out.println("\t\t\t\tYOU HAVE REACHED THE LIMIT");
			System.out.println();
			System.out.println("\t\t\t\tRESET YOUR MOBILE NUMBER");
			System.out.println();
			System.out.println("\t\t\t\tENETR 1 TO RESET YOUR MOBILE NUMBER");
			System.out.println();
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("\t\t\t\tENTER YOUR MAIL ID");
				System.out.println();
				String MAILID=sc.next();
				if(MAILID.equals(obj.getmailid()))
				{
					System.out.println("\t\t\t\tYOUR OTP HAS SENT TO YOUR MAIL ID");
					System.out.println();
					int OTP=r.nextInt(1000)+9999;
					int otp=show(OTP);
					System.out.println("\t\t\t\tENTER OTP SENT TO YOUR MAILID");
					System.out.println();
					if(otp==sc.nextInt())
					{
						System.out.println("\t\t\t\tOTP VALIDATION SUCCESSFULL");
						System.out.println();
						System.out.println("\t\t\t\tENTER YOUR NEW MOBILE NUMBER");
						System.out.println();
						long no=sc.nextInt();
						System.out.println();
						obj.setmobileNo(no);
						System.out.println("<\t\t\t\tYOUR MOBILE HAS UPDATED SUCCESSFULLY");
						System.out.println();
						System.out.println("<\t\t\t\tENTER 1 TO CONTINUE LOGIN");
						System.out.println();
						int a=sc.nextInt();
						if(a==1)
						{
							login();
						}
						
					}
					else
					{
						System.out.println("\t\t\t\tINVALID OTP");
						System.out.println();
						resetNo();
					}
				}
			}
		}
	}
	static void resetPassword()
	{
		int i;
		for(i=1;i<=2;i++)
		{
			System.out.println("\t\t\t\tINVALID PASSWORD PLEASE ENETER AGAIN");
			System.out.println();
			String PASSWORD=sc.next();
			if(PASSWORD.equals(obj.getpassword()))
			{
				System.out.println("\t\t\t\tA2Z login sucessfull");
				System.out.println();
				obj.dashboard();
				break;	
			}
		}
		if(i>2)
		{
			System.out.println("\t\t\t\tYOU HAVE REACHED THE LIMIT");
			System.out.println();
			System.out.println("\t\t\t\tRESET YOUR PASSWORD");
			System.out.println();
			System.out.println("\t\t\t\tENETR 1 TO RESET YOUR PASSWORD");				System.out.println();
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("\t\t\t\tENTER YOUR MAIL ID");
				System.out.println();
				String MAILID=sc.next();
				if(MAILID.equals(obj.getmailid()))
				{
					System.out.println("\t\t\t\tYOUR OTP HAS SENT TO YOUR MAIL ID");
					System.out.println();
					int OTP=r.nextInt(1000)+9999;
					int otp=show(OTP);
					System.out.println("\t\t\t\tENTER OTP SENT TO YOUR MAILID");
					System.out.println();
					if(otp==sc.nextInt())
					{
						System.out.println("\t\t\t\tOTP VALIDATION SUCCESSFULL");
						System.out.println();
						System.out.println("\t\t\t\tENTER YOUR NEW PASSWORD");
						System.out.println();
						String pswd=sc.next();
						System.out.println();
						obj.setpassword(pswd);
						System.out.println("<---------- YOUR PASSWORD HAS UPDATED SUCCESSFULLY---------->");
						System.out.println("\t\t\t\tENTER 1 TO CONTINUE LOGIN ");
						System.out.println();
						int a=sc.nextInt();
						if(a==1)
						{
							login();
						}
						
					}
				}
				else
				{
					System.out.println("\t\t\t\tYOU HAVE ENTERED WRONG MAIL ID");
					System.out.println();	
					resetPassword();
				}

			}
		}
	}
	static void register()
	{
		System.out.println();
		System.out.println("\t\t\t\tENTER YOUR MAIL ID");
		System.out.println();
			obj.setmailid(sc.next());
			//System.out.println("\t\t\t\tENTER OTP SENT TO YOUR MAIL ID");
			
			System.out.println("\t\t\t\tENTER YOUR MOBILE NUMBER");
			System.out.println();
			obj.setmobileNo(sc.nextLong());
			System.out.println("\t\t\t\tENTER YOUR PASSWORD");
			System.out.println();
			obj.setpassword(sc.next());
			System.out.println(RED+"\t\t\t\tREGISTERED SUCCESSFULLY"+RESET);
			System.out.println();
			System.out.println("\t\t\t\tIF YOU WANT TO LOGIN");
			System.out.println();
			System.out.println("\t\t\t\tENTER 1 ");
			System.out.println();
			int b=sc.nextInt();
			if(b==1)
			{
				login();
				
			}
	}
	public static void main(String[] args)
	{
		
		System.out.println("\t\t\t\tENTER 1 FOR LOGIN");
		 System.out.println("");
		System.out.println("\t\t\t\tENTER 2 FOR REGISTER");
		 System.out.println("");

		int a=sc.nextInt();
                 System.out.print("\t\t\tLoading");
                 try
	{
		for(int i = 1;i<=5;i++)
		{	
			Thread.sleep(1000);
			System.out.print(". ");
		}
                System.out.println("");
	}
        catch(Exception e)
	{}
		if(a==1)
		{
			
			login();
			
			
		}
		else if(a==2)
		{
			register();
			
		}
		
	}
}

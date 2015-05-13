public class Proyecto
{
	static String productos[] = {"Prod_1", "Prod_2", "Prod_3", "Prod_4", "Prod_5", "Prod_6", "Prod_7", "Prod_8", "Prod_9", "Prod_10"};
	static String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Total Producto"};
	static String maximoMesP[]= new String[meses.length-1];
	static int TOTALPROD[] = new int[productos.length], TOTALMES[] = new int[meses.length-1], maximoMes[]= new int[meses.length-1];
	static int ventas[][];
	static int MAXcant=0;
	static String MAXMes="", MAXProd="";
	
	
	public static void main(String[] args)
	{
		llenarMatriz();
		sumarFilas();
		sumarColum();
		maxVendido();
		mostrarArrays();
	}
	
	static void llenarMatriz()//Llenamos la matriz ventas con numeros aleatorios entre 0 y 9
	{
		ventas = new int[productos.length][meses.length-1];
		int ale=0;
		
		for(int a=0; a<ventas.length; a++)
		{
			for(int b=0; b<ventas[a].length;b++)
			{
				ale = (int)(Math.random()*100);
				ventas[a][b] = ale;
			}
		}
	}
	
	static void sumarFilas() //Metodo para sumar las filas
	{
		for (int f=0; f<ventas.length; f++) 
		{
			
			for (int c=0; c<ventas[f].length; c++)
			{
				TOTALPROD[f] =  TOTALPROD[f] + ventas[f][c];
			}
		}
	 }
	
	 static void sumarColum()//Metodo para sumar las columnas
	 {
		 int suma=0;
		  
		 for(int f=0; f<meses.length-1; f++)
		 {
			 suma = 0;
			 
			 for(int c=0; c<productos.length; c++)
			 {
				 suma = suma + ventas[c][f];
			 }
			 TOTALMES[f] = suma;
	       }
	 }
	 
	 static void maxVendido()//Llena el array del Maximo de cada Mes
	 {
		 int mesMax=0;
		 String prodMAX="";
		 
		 for (int f=0; f<meses.length-1; f++)
		 {
			 mesMax = 0;
			 for (int c=0; c<productos.length; c++)
			 {
				 if(ventas[c][f] >= mesMax)
				 {
					 mesMax = ventas[c][f];
					 prodMAX = productos[c];
				 }
				 
				 if(ventas[c][f] >= MAXcant)
				 {
					 MAXcant = ventas[c][f];
					 MAXMes = meses[f];
					 MAXProd = productos[c];
				 }
				 
				 maximoMes[f] = mesMax;
				 maximoMesP[f] = prodMAX;
				 
			 }
		 }
	 }
	
	static void mostrarArrays()//Metodo para mostrar todos los arrays de form ordenada
	{
		//Bucle que muestra los meses del año
		for(int a=0; a<meses.length; a++)
		{
			System.out.print((a==0?"\t\t":"")+"│"+(a==1 || a==8 || a==9 || a==10 || a==11?meses[a]+"\t":meses[a]+"\t\t")
					+(a==12?"│\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n":""));
		}
		
		//Metodo para mostrar las compra de cada producto por mes
		for (int f=0; f<ventas.length; f++) 
		{
			for (int c=0; c<ventas[f].length; c++)
			{ 
				System.out.print((c==0?"    "+productos[f]+"\t│\t":"")+ventas[f][c]+"\t│\t"+(c==11?"   "+TOTALPROD[f]+"\t\t│\n":""));
			}
			System.out.println("├───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┤");
		}
		System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
		
		//Bucle que muestra el total de cada mes
		for(int a=0; a<TOTALMES.length; a++)
		{
			System.out.print((a==0?"|Total Mes: "+"\t│\t":"")+TOTALMES[a]+"\t|\t");
		}
		System.out.println();
		
		//Bucle que muestra el Maximo de cada mes (En letras)
		for(int a=0; a<TOTALMES.length; a++)
		{
			System.out.print((a==0?"|Maximo Mes: "+"\t│":"")+maximoMesP[a]+" "+maximoMes[a]+"Uds"+"\t|");
		}
		System.out.println("");
		System.out.println("--> El mas vendido es: "+MAXProd+" en "+MAXMes+" con "+MAXcant+" unidades.");
		
	}
}

class Publisher
{
	String pubName;
	Publisher(String pubName)
	{
		this.pubName=pubName;
	}
	void display()
	{
		System.out.println("Publisher\t : "+pubName);
	}
}

class Book extends Publisher
{
	String title;
	String author;
	Book(String pubName,String title,String author)
	{
		super(pubName);
		this.title=title;
		this.author=author;
	}
	void display()
	{
		super.display();
		System.out.println("Title\t\t : "+title);
		System.out.println("Author\t\t : "+author);
	}
}

class Literature extends Book
{
	String type;
	Literature(String pubName,String title,String author,String type)
	{
		super(pubName,title,author);
		this.type=type;
	}
	void display()
	{
		super.display();
		System.out.println("Type\t\t : "+type);
	}
}

class Fiction extends Book
{
	String genre;
	Fiction(String pubName,String title,String author,String genre)
	{
		super(pubName,title,author);
		this.genre=genre;
	}
	void display()
	{
		super.display();
		System.out.println("Genre \t\t : "+genre);
	}
}

class Books
{
	public static void main(String[] args)
	{
		Literature[] l=new Literature[2];
		Fiction[] f=new Fiction[2];
		
		l[0]=new Literature("HarperCollins","The Alchemist","Paulo Coelho","Drama");
		l[1]=new Literature("DC Books","Aarachaar","K.R. Meera","Novel");
		
		f[0]=new Fiction("Cassel","Macbeth","William Shakespeare","Tragedy");		
		f[1]=new Fiction("Penguin Books","The Legends of Khasak","O.V Vijayan","Magical Realism");
		System.out.println("\n====================================================================");
		System.out.println("\n\t\tLiterature\n\t\t----------");
		for(int i=0;i<l.length;i++)
		{
			System.out.println("\n#"+(i+1)+"\n");
			l[i].display();
		}
		System.out.println("\n====================================================================");
		System.out.println("\n\t\tFiction\n\t\t--------");
		for(int i=0;i<f.length;i++)
		{
			System.out.println("\n#"+(i+1)+"\n");
			f[i].display();
		}
	}
}
		

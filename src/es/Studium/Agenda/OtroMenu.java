package es.Studium.Agenda;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class OtroMenu extends Frame implements WindowListener, ActionListener
{
	// En primer lugar creamos la barra de men�
	MenuBar barraMenu = new MenuBar();
	// Ahora creamos los elementos principales del men�
	Menu articulos = new Menu(" Art�culos ");
	Menu clientes = new Menu(" Clientes ");
	Menu facturas = new Menu(" Facturas ");
	// Cada opci�n del men�
	MenuItem nuevoart = new MenuItem("Nuevo");
	MenuItem eliminarart = new MenuItem("Eliminar");
	MenuItem consultarart= new MenuItem("Consultar");
	MenuItem nuevocli = new MenuItem("Nuevo");
	MenuItem eliminarcli = new MenuItem("Eliminar");
	MenuItem consultarcli= new MenuItem("Consultar");
	MenuItem nuevafac = new MenuItem("Nuevo");
	MenuItem consultarfac= new MenuItem("Consultar");
	Dialog mensaje=new Dialog(this, "Opci�n seleccionada", true);
	Label opcion = new Label("");
	public OtroMenu()
	{
		setLayout (new FlowLayout());
		setTitle ("Men�" );
		// el men� de art�culos
		articulos.add(nuevoart);
		articulos.add(eliminarart);
		articulos.add(consultarart);
		//Se a�aden los Listeners a las opciones de los submen�s
		//no a las opciones del men�
		nuevoart.addActionListener(this);
		eliminarart.addActionListener(this);
		consultarart.addActionListener(this);
		//el men� de clientes
		clientes.add(nuevocli);
		clientes.add(eliminarcli);
		clientes.add(consultarcli);
		//Se a�aden los Listeners a las opciones de los submen�s
		//no a las opciones del men�
		nuevocli.addActionListener(this);
		eliminarcli.addActionListener(this);
		consultarcli.addActionListener(this);
		//el men� de facturas
		facturas.add(nuevafac);
		facturas.add(consultarfac);
		//Se a�aden los Listeners a las opciones de los submen�s
		//no a las opciones del men�
		nuevafac.addActionListener(this);
		consultarfac.addActionListener(this);
		//Opciones a barramenu
		barraMenu.add(articulos);
		barraMenu.add(clientes);
		barraMenu.add(facturas);
		//Establecemos la barra de men�
		setMenuBar(barraMenu);
		//Ventana de di�logo
		mensaje.setLayout(new FlowLayout());
		mensaje.addWindowListener(this);
		mensaje.setSize(250, 100);
		mensaje.setResizable(false);
		mensaje.add(opcion);
		//Listener de ventana
		addWindowListener(this);
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new OtroMenu();
	}
	public void actionPerformed(ActionEvent arg0)
	{
		int nmenu, nitemmenu;
		String cmenu="", citemmenu="";
		for( nmenu=0; nmenu<barraMenu.getMenuCount();nmenu++)
		{
			for(nitemmenu=0;nitemmenu<barraMenu.getMenu(nmenu).getItemCount();nitemmenu++)
			{
				if(barraMenu.getMenu(nmenu).getItem(nitemmenu).equals(arg0.getSource()))
				{
					cmenu=barraMenu.getMenu(nmenu).getLabel();
					citemmenu=barraMenu.getMenu(nmenu).getItem(nitemmenu).getLabel();
				}
			}
		}
		opcion.setText("Opcion " + citemmenu+ " de Men� " + cmenu);
		mensaje.setVisible(true);
	}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e)
	{
		if(mensaje.hasFocus())
		{
			mensaje.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}
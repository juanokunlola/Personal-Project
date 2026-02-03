/*
Author: Juan Okunlola

Program: Periodic Table Element Lookup

Purpose: To allow a users to input a chemical symbol and receive the full element name,
able to list all 118 elements. As a student currently taking chemical this is a 
creativity to help me and other student study to help learn the Elements.

Reflection: This program uses a switch statement to efficiently map short symbols to
long names, and demonstrates the importance of string matching for
case-sensitive input 
*/
import java.util.Scanner; 

   public class PeriodicTableLookup {
           public static void main(String[] args) {
Scanner scanf = new Scanner(System.in); 

System.out.println("--- Periodic Table Element Lookup (1-118) ---");
System.out.print("Enter element symbol (case-sensitive): ");
String symbol = scanf.next(); 
String elementName = "";

// Using a switch statement for efficient lookup of all 118 elements
switch (symbol) {
// Period 1
case "H": elementName = "Hydrogen"; break;
case "He": elementName = "Helium"; break;

// Period 2
case "Li": elementName = "Lithium"; break;
case "Be": elementName = "Beryllium"; break;
case "B": elementName = "Boron"; break;
case "C": elementName = "Carbon"; break;
case "N": elementName = "Nitrogen"; break;
case "O": elementName = "Oxygen"; break;
case "F": elementName = "Fluorine"; break;
case "Ne": elementName = "Neon"; break;

// Period 3
case "Na": elementName = "Sodium"; break;
case "Mg": elementName = "Magnesium"; break;
case "Al": elementName = "Aluminum"; break;
case "Si": elementName = "Silicon"; break;
case "P": elementName = "Phosphorus"; break;
case "S": elementName = "Sulfur"; break;
case "Cl": elementName = "Chlorine"; break;
case "Ar": elementName = "Argon"; break;

// Period 4
case "K": elementName = "Potassium"; break;
case "Ca": elementName = "Calcium"; break;
case "Sc": elementName = "Scandium"; break;
case "Ti": elementName = "Titanium"; break;
case "V": elementName = "Vanadium"; break;
case "Cr": elementName = "Chromium"; break;
case "Mn": elementName = "Manganese"; break;
case "Fe": elementName = "Iron"; break;
case "Co": elementName = "Cobalt"; break;
case "Ni": elementName = "Nickel"; break;
case "Cu": elementName = "Copper"; break;
case "Zn": elementName = "Zinc"; break;
case "Ga": elementName = "Gallium"; break;
case "Ge": elementName = "Germanium"; break;
case "As": elementName = "Arsenic"; break;
case "Se": elementName = "Selenium"; break;
case "Br": elementName = "Bromine"; break;
case "Kr": elementName = "Krypton"; break;

// Period 5
case "Rb": elementName = "Rubidium"; break;
case "Sr": elementName = "Strontium"; break;
case "Y": elementName = "Yttrium"; break;
case "Zr": elementName = "Zirconium"; break;
case "Nb": elementName = "Niobium"; break;
case "Mo": elementName = "Molybdenum"; break;
case "Tc": elementName = "Technetium"; break;
case "Ru": elementName = "Ruthenium"; break;
case "Rh": elementName = "Rhodium"; break;
case "Pd": elementName = "Palladium"; break;
case "Ag": elementName = "Silver"; break;
case "Cd": elementName = "Cadmium"; break;
case "In": elementName = "Indium"; break;
case "Sn": elementName = "Tin"; break;
case "Sb": elementName = "Antimony"; break;
case "Te": elementName = "Tellurium"; break;
case "I": elementName = "Iodine"; break;
case "Xe": elementName = "Xenon"; break;

// Period 6
case "Cs": elementName = "Cesium"; break;
case "Ba": elementName = "Barium"; break;
case "La": elementName = "Lanthanum"; break;
case "Ce": elementName = "Cerium"; break;
case "Pr": elementName = "Praseodymium"; break;
case "Nd": elementName = "Neodymium"; break;
case "Pm": elementName = "Promethium"; break;
case "Sm": elementName = "Samarium"; break;
case "Eu": elementName = "Europium"; break;
case "Gd": elementName = "Gadolinium"; break;
case "Tb": elementName = "Terbium"; break;
case "Dy": elementName = "Dysprosium"; break;
case "Ho": elementName = "Holmium"; break;
case "Er": elementName = "Erbium"; break;
case "Tm": elementName = "Thulium"; break;
case "Yb": elementName = "Ytterbium"; break;
case "Lu": elementName = "Lutetium"; break;
case "Hf": elementName = "Hafnium"; break;
case "Ta": elementName = "Tantalum"; break;
case "W": elementName = "Tungsten"; break;
case "Re": elementName = "Rhenium"; break;
case "Os": elementName = "Osmium"; break;
case "Ir": elementName = "Iridium"; break;
case "Pt": elementName = "Platinum"; break;
case "Au": elementName = "Gold"; break;
case "Hg": elementName = "Mercury"; break;
case "Tl": elementName = "Thallium"; break;
case "Pb": elementName = "Lead"; break;
case "Bi": elementName = "Bismuth"; break;
case "Po": elementName = "Polonium"; break;
case "At": elementName = "Astatine"; break;
case "Rn": elementName = "Radon"; break;

// Period 7
case "Fr": elementName = "Francium"; break;
case "Ra": elementName = "Radium"; break;
case "Ac": elementName = "Actinium"; break;
case "Th": elementName = "Thorium"; break;
case "Pa": elementName = "Protactinium"; break;
case "U": elementName = "Uranium"; break;
case "Np": elementName = "Neptunium"; break;
case "Pu": elementName = "Plutonium"; break;
case "Am": elementName = "Americium"; break;
case "Cm": elementName = "Curium"; break;
case "Bk": elementName = "Berkelium"; break;
case "Cf": elementName = "Californium"; break;
case "Es": elementName = "Einsteinium"; break;
case "Fm": elementName = "Fermium"; break;
case "Md": elementName = "Mendelevium"; break;
case "No": elementName = "Nobelium"; break;
case "Lr": elementName = "Lawrencium"; break;
case "Rf": elementName = "Rutherfordium"; break;
case "Db": elementName = "Dubnium"; break;
case "Sg": elementName = "Seaborgium"; break;
case "Bh": elementName = "Bohrium"; break;
case "Hs": elementName = "Hassium"; break;
case "Mt": elementName = "Meitnerium"; break;
case "Ds": elementName = "Darmstadtium"; break;
case "Rg": elementName = "Roentgenium"; break;
case "Cn": elementName = "Copernicium"; break;
case "Nh": elementName = "Nihonium"; break;
case "Fl": elementName = "Flerovium"; break;
case "Mc": elementName = "Moscovium"; break;
case "Lv": elementName = "Livermorium"; break;
case "Ts": elementName = "Tennessine"; break;
case "Og": elementName = "Oganesson"; break;
default: elementName = "Unknown Element"; break;
} 

if (!elementName.equals("Unknown Element")) 
    {
System.out.printf("Symbol: %-3s Is Known as Element: %s%n", symbol, elementName);
} else {
System.out.println("Element not found. Please check capitalization (e.g., 'He' not 'he').");
} 
scanf.close();
}
 
   }

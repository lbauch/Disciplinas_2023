package Modelo;

import Estrutura.ListaEstatica;

public enum Tag {

	AREA("area", true), BASE("base", true), BR("br", true), HR("hr", true), IMG("img", true), INPUT("input", true),
	LINK("link", true), META("meta", true), PARAM("param", true), SOURCE("source", true), VIDEO("video"),

	DOCTYPE_HTML5("!DOCTYPE", true),

	A("a"), ADDRESS("address"), APPLET("applet"), B("b"), BASEFONT("basefont"), BIG("big"), BLOCKQUOTE("blockquote"),
	BODY("body"), CAPTION("caption"), CENTER("center"), CITE("cite"), CODE("code"), COL("col"), DD("dd"), DFN("dfn"),
	DIR("dir"), DIV("div"), DL("dl"), DT("dt"), EMBED("embed"), EM("em"), FONT("font"), FORM("form"), FRAME("frame"),
	FRAMESET("frameset"), H1("h1"), H2("h2"), H3("h3"), H4("h4"), H5("h5"), H6("h6"), HEAD("head"), HTML("html"),
	I("i"), ISINDEX("isindex"), KBD("kbd"), LI("li"), MAP("map"), MENU("menu"), NOBR("nobr"), NOFRAMES("noframes"),
	OBJECT("object"), OL("ol"), OPTION("option"), HEADER("header"), SECTION("section"), FOOTER("footer"),

	P("p"), PRE("pre"), SAMP("samp"), SCRIPT("script"), SELECT("select"), SMALL("small"), SPAN("span"),
	STRIKE("strike"), S("s"), STRONG("strong"), STYLE("style"), SUB("sub"), SUP("sup"), TABLE("table"), TD("td"),
	TEXTAREA("textarea"), TH("th"), TITLE("title"), TR("tr"), TT("tt"), U("u"), UL("ul"), VAR("var");

	private boolean singleton;
	private String nome;
	private int quantidade;

	private Tag(String nome) {
		this.nome = nome;
	}

	private Tag(String nome, boolean isSingleton) {
		setNome(nome);
		setSingleton(isSingleton);
		setQuantidade(1);
	}

	public static ListaEstatica<Tag> getSingletons() {
		ListaEstatica<Tag> singletons = new ListaEstatica<>();
		for (Tag tag : values()) {
			if (tag.isSingleton()) {
				singletons.inserir(tag);
			}
		}

		return singletons;
	}

	public boolean isSingleton() {
		return singleton;
	}

	public void setSingleton(boolean singleton) {
		this.singleton = singleton;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}

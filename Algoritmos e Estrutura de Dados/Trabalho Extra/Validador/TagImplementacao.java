package Validador;

import Modelo.Tag;

public abstract class TagImplementacao {

	private TagImplementacao() {
		throw new UnsupportedOperationException();
	}

	public static Tag getTags(String nome) {
		Tag[] tags = Tag.values();
		Tag tag = null;
		for (Tag t : tags) {
			if (t.getNome().equalsIgnoreCase(nome)) {
				tag = t;
				break;
			}
		}

		return tag;
		
	}

}

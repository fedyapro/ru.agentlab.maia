package ru.agentlab.maia.agent.event;

import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;

//<<<<<<< HEAD
//import ru.agentlab.maia.Event;
//=======
import ru.agentlab.maia.agent.Event;
//>>>>>>> refs/remotes/origin/feature/#32-beliefbase-centric

public class RemovedBeliefObjectPropertyAssertionAxiomEvent extends Event<OWLObjectPropertyAssertionAxiom> {

	public RemovedBeliefObjectPropertyAssertionAxiomEvent(OWLObjectPropertyAssertionAxiom payload) {
		super(payload);
	}

}

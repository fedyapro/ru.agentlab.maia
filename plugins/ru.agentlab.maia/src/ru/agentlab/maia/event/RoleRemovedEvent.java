package ru.agentlab.maia.event;

import ru.agentlab.maia.EventType;

public class RoleRemovedEvent extends Event<Class<?>> {

	public RoleRemovedEvent(Class<?> role) {
		super(role);
	}

	@Override
	public EventType getType() {
		return EventType.ROLE_REMOVED;
	}

}
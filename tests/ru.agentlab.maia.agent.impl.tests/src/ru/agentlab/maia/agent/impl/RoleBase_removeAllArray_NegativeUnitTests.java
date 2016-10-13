package ru.agentlab.maia.agent.impl;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ru.agentlab.maia.agent.IRole;
import ru.agentlab.maia.tests.util.category.speed.QuickTests;
import ru.agentlab.maia.tests.util.category.type.UnitTests;
import ru.agentlab.maia.tests.util.category.visibility.WhiteBoxTests;

/**
 * Tests for {@link RoleBase#removeAll(IRole[])}
 * 
 * @author Dmitriy Shishkin <shishkindimon@gmail.com>
 */
@Category({ UnitTests.class, QuickTests.class, WhiteBoxTests.class })
public class RoleBase_removeAllArray_NegativeUnitTests extends RoleBaseAbstractTest {

	@Test
	public void nullArray() {
		// Given
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("Roles to remove should be non null");
		// When
		roleBase.removeAll((IRole[]) null);
	}

}
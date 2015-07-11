/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package l2tserver.gameserver.stats.conditions;

import l2tserver.gameserver.stats.Env;

/**
 * The Class ConditionPlayerMp.
 */
public class ConditionPlayerMp extends Condition {
	
	private final int _mp;
	
	/**
	 * Instantiates a new condition player mp.
	 *
	 * @param mp the mp
	 */
	public ConditionPlayerMp(int mp)
	{
		_mp = mp;
	}
	
	/* (non-Javadoc)
	 * @see l2tserver.gameserver.stats.conditions.Condition#testImpl(l2tserver.gameserver.stats.Env)
	 */
	@Override
	public boolean testImpl(Env env) {
		return env.player.getCurrentMp()*100/env.player.getMaxMp() <= _mp;
	}
}
sealed class BattleState {
    object Progress : BattleState() {
        // содержит в себе необходимую информацию для вывода в консоль.
        // Например: суммарное здоровье команды или количество оставшихся воинов.
    }

    object FirstTeamWin : BattleState()
    object SecondTeamWin : BattleState()
    object DrawnGame : BattleState()
}
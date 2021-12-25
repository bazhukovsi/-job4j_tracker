package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской системы
 * В системе есть пользователи, счета (пользователь может иметь несколько счетов)
 * В системе возможны операции
 * - добавление пользователя
 * - добавление счета
 * - перевод со счета на счет пользователя
 *
 * @author Bazhukov Sergey
 * @version 1.0
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет добавить пользователя
     * Если пользователь с таким именем есть в системе он не добавляется
     *
     * @param user пользователь который добавляется в банковскую систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод позволяет добавить счета для пользователя
     * Поиск пользователя производится по паспорту
     * При наличии пользователя в системе проверяется все его счета
     * Если счет уже присутствует у пользователя добавление не производится
     *
     * @param passport паспорт пользователя, по которому проверяется наличие пользователя в системе
     * @param account  счет, который добавляется пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод позволяет найти пользователя по паспорту
     * Метод используется в методе добавления счетов для поиска пользователя
     * Метод используется в методе поиска счета по реквизитам
     *
     * @param passport паспорт пользователя, по которому осуществляется поиск
     * @return User, при отсутствии пользователя в системе null
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод позволяет найти счет пользователя по реквизитам
     * В методе используется метод поиска по папорту для идентификации пользователя
     *
     * @param passport
     * @param requisite
     * @return Account, при отсутствии null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод позволяет перевести денежные средства со счета на счет
     * Если счет не найден или на счете источнике не хватает денежных средств возвращается false
     *
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return true при успешном переводе, в противном случае false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && src.getBalance() >= amount && dest != null) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

}

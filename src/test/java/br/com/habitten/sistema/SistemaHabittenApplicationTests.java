package br.com.habitten.sistema;

import static org.habitten.sistema.db.Tables.CLIENTE;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SistemaHabittenApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testeJooq(){
        String user = "postgres";
        String pass = "123";
        String url = "jdbc:postgresql://localhost:5432/habitten_sistema";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {

            DSLContext ctx = DSL.using(conn, SQLDialect.POSTGRES_9_4);


            String a = "";
            ctx.insertInto(CLIENTE,
                    CLIENTE.ID, CLIENTE.NOME, CLIENTE.SOBRENOME)
                    .values((long) 2,"TESTE 1", "TESTE 1")
                    .values((long) 3, "TESTE 2", "TESTE 2")
                    .execute();


            List<Record> result = ctx.select().from(CLIENTE).fetch();
            result.forEach(r -> System.out.println(r.formatJSON()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

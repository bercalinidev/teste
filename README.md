# teste

usei o flyway para contrar as migrações das tabelas com o banco de dados, no meu caso usei o mysql.
usei o loombok para evitar codigos doplicados como getter e setter(como usei o STS, usei um plugin para poder usar)

na parte do JPQL usei o joinfeth para evitar select mal otimizados, como evitar também o problema de n + 1.

na parte de retornar os dados sensiveis, não tinha a senha no exemplo das entidades que vcs me passaram, mais se fosse pra proteger,
usaria o msm DTO que estou usando para não retornar a senha quando fazer um get nas informações.

usei um input de entrada, e um DTO para o resultado final, não gosto de trabalhar com o objeto realmente, gosto de manipular a entrada, e a
saida, assim tenho total controle doque posso mostrar pro usuario final.
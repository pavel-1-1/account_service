create table balance
(
    id                    bigserial primary key,
    account_id            bigint references account (id),
    authorization_balance numeric not null default 0,
    current_balance       numeric not null default 0,
    created_at            timestamptz default current_timestamp,
    updated_at            timestamptz default current_timestamp,
    version               bigint
);
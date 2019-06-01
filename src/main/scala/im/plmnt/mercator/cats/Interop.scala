package im.plmnt.mercator.cats

import cats.Monad
import mercator.Monadic

trait Interop {
  implicit def deriveMonadicForCatsMonad[F[_]](implicit monad: Monad[F]): Monadic[F] =
    new Monadic[F] {
      def point[A](value: A): F[A] = monad.pure(value)
      def flatMap[A, B](from: F[A], fn: A => F[B]): F[B] = monad.flatMap(from)(fn)
      def map[A, B](from: F[A], fn: A => B): F[B] = monad.map(from)(fn)
    }
}
